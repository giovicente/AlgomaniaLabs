package com.giovicente.alphabet.encrypter;

public class BinarySearchEncrypter implements Encrypter {
    @Override
    public String encrypt(String textToEncrypt) {
        final String ALPHABET = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
        char[] alphabetChars = ALPHABET.toCharArray();

        StringBuilder encryptedText = new StringBuilder();

        for (int i = 0; i < textToEncrypt.length(); i++) {
            if (textToEncrypt.charAt(i) != ' ') {
                int left = 0;
                int right = alphabetChars.length - 1;

                while (left <= right) {
                    int middle = left + (right - left ) / 2;

                    if (ALPHABET.charAt(middle) == Character.toUpperCase(textToEncrypt.charAt(i))) {
                        encryptedText.append(middle + 1);
                        right = -1;
                    }

                    if (ALPHABET.charAt(middle) < Character.toUpperCase(textToEncrypt.charAt(i))) {
                        left = middle + 1;
                    }

                    if (ALPHABET.charAt(middle) > Character.toUpperCase(textToEncrypt.charAt(i))) {
                        right = middle - 1;
                    }
                }
            }
        }

        return encryptedText.toString();
    }
}
