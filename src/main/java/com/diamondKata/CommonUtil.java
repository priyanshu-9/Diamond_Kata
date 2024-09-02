package com.diamondKata;

public class CommonUtil {
    public static boolean isValidInput(String input) {
        // Function is checking if the provided input is a single letter from A to Z
        return input.length() == 1 && input.charAt(0) >= 'A' && input.charAt(0) <= 'Z';
    }

}
