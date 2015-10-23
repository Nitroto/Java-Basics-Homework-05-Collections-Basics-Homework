/**
 * Write a program that enters an array of strings and finds in it the largest sequence of equal elements.
 * If several sequences have the same longest length, print the leftmost of them. The input strings are given
 * as a single line, separated by a space.
 */

import java.util.Scanner;

public class LargestSequenceOfEqualStrings {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        String[] arrayOfStrings = input.nextLine().split(" ");

        int longestSequenceLength = 1;
        String longestSequenceElement = arrayOfStrings[0];

        int currentLongestSequenceLength = 1;
        String currentLongestSequence = arrayOfStrings[0];

        for (int i = 1; i < arrayOfStrings.length; i++) {
            if (arrayOfStrings[i].equals(arrayOfStrings[i - 1]) && i != arrayOfStrings.length - 1) {
                currentLongestSequenceLength++;
            } else {
                if (arrayOfStrings[i].equals(currentLongestSequence)) {
                    currentLongestSequenceLength++;
                }
                if (currentLongestSequenceLength > longestSequenceLength) {
                    longestSequenceLength = currentLongestSequenceLength;
                    longestSequenceElement = arrayOfStrings[i - 1];
                }

                currentLongestSequenceLength = 1;
                currentLongestSequence = arrayOfStrings[i];
            }
        }

        for (int i = 0; i < longestSequenceLength; i++) {
            System.out.print(longestSequenceElement + " ");
        }

    }
}
