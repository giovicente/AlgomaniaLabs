package com.giovicente.human.readable.time;

public class HumanReadableTime {

    public static String makeReadable(int seconds) {
        if (isValid(seconds)) {
            return String.format(
                   "%02d:%02d:%02d", seconds / 3600, (seconds % 3600) / 60, seconds % 60
          );
        }

        return "Invalid Input";
    }

    private static boolean isValid(int seconds) {
        final int MAXIMUM_VALID_INPUT = 359999;
        final int MINIMUM_VALID_INPUT = 0;

        return seconds >= MINIMUM_VALID_INPUT && seconds <= MAXIMUM_VALID_INPUT;
    }
}
