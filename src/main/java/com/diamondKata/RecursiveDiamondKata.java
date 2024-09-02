package com.diamondKata;

import java.util.Scanner;

public class RecursiveDiamondKata {

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

        StringBuilder upperPart = new StringBuilder();
        StringBuilder lowerPart = new StringBuilder();

        printUpperPart('A', alphabet, upperPart);
        printLowerPart((char) (alphabet - 1), alphabet, lowerPart);

        return upperPart.append(lowerPart).toString();
    }

    // Recursively appends the upper part of the diamond
    private static void printUpperPart(char current, char alphabet, StringBuilder diamond) {
        if (current > alphabet) {
            return;
        }
        appendLine(current, alphabet, diamond);
        printUpperPart((char) (current + 1), alphabet, diamond);
    }

    // Recursively appends the lower part of the diamond
    private static void printLowerPart(char current, char alphabet, StringBuilder diamond) {
        if (current < 'A') {
            return;
        }
        appendLine(current, alphabet, diamond);
        printLowerPart((char) (current - 1), alphabet, diamond);
    }

    // Appends a single line of the diamond
    private static void appendLine(char current, char alphabet, StringBuilder diamond) {
        int spacesBefore = alphabet - current;
        int spacesBetween = 2 * (current - 'A') - 1;

        // For appending leading spaces
        for (int i = 0; i < spacesBefore; i++) {
            diamond.append(" ");
        }

        // For appending the current character
        diamond.append(current);

        // For appending spaces between characters, if applicable
        if (current != 'A') {
            for (int i = 0; i < spacesBetween; i++) {
                diamond.append(" ");
            }
            diamond.append(current);
        }

        //For next line
        diamond.append("\n");
    }
}