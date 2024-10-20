package com.giovicente.alphabet.encrypter;

public class LinearSearchEncrypter implements Encrypter {

    @Override
    public String encrypt(String textToEncrypt) {
        final String ALPHABET = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
        StringBuilder encryptedText = new StringBuilder();


        for (int i = 0; i < textToEncrypt.length(); i++) {
            if (textToEncrypt.charAt(i) != ' ') {
                for (int j = 0; j < ALPHABET.length(); j++) {
                    if (Character.toUpperCase(textToEncrypt.charAt(i)) == ALPHABET.charAt(j)) {
                        encryptedText.append(j + 1);
                        j = ALPHABET.length();
                    }
                }
            }
        }

        return encryptedText.toString();
    }
}
