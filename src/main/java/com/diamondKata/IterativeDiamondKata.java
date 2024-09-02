package com.diamondKata;

import java.util.Scanner;

public class IterativeDiamondKata {
    public static void main(String[] args) {
        // HARD CODED INPUTS
        // System.out.println(printDiamond('B'));
        // System.out.println(printDiamond('C'));

        // USER INPUTS
        Scanner scanner = new Scanner(System.in);
        // PROMPT FOR USER
        //System.out.print("Enter a letter from A to Z: ");

        /** Here we are upper-casing the characters/Alphabets.
         we can also handle small case alphabets as well in future**/

        String input = scanner.nextLine().toUpperCase();

        // Validate input
        if (CommonUtil.isValidInput(input)) {
            char letter = input.charAt(0);
            // CALL THE FUNCTION
            System.out.println(printDiamond(letter));
        } else {
            // VALIDATION ERROR
            System.out.println("Invalid input. Please enter a single letter from A to Z.");
        }
        scanner.close();
    }
    public static String printDiamond(char alphabet) {
        int primaryIndex = alphabet - 'A';
        StringBuilder diamond = new StringBuilder();

        // Loop to Build the top half of the diamond
        for (int i = 0; i <= primaryIndex; i++) {
            appendLine(diamond, primaryIndex, i);
        }

        // Loop to Build the bottom half of the diamond
        for (int i = primaryIndex - 1; i >= 0; i--) {
            appendLine(diamond, primaryIndex, i);
        }

        return diamond.toString();
    }

    private static void appendLine(StringBuilder diamond, int primaryIndex, int currentIndex) {
        // Loop to add Leading spaces
        for (int j = 0; j < primaryIndex - currentIndex ; j++) {
            diamond.append(" ");
        }

        // First character
        diamond.append((char) ('A' + currentIndex));

        // For adding Spaces between characters
        if (currentIndex > 0) {
            for (int j = 0; j < 2 * currentIndex - 1; j++) {
                diamond.append(" ");
            }
            diamond.append((char) ('A' + currentIndex));
        }

        // For New line
        diamond.append("\n");
    }

}
