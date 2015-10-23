/**
 * Write a program that enters an array of strings and finds in it all sequences of equal elements.
 * The input strings are given as a single line, separated by a space.
 */

import java.util.Scanner;

public class SequencesOfEqualStrings {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        String[] arrayOfStrings = input.nextLine().split(" ");

        System.out.print(arrayOfStrings[0] + " ");

        for (int i = 1; i < arrayOfStrings.length; i++) {
            if (arrayOfStrings[i].equals(arrayOfStrings[i - 1])) {
                System.out.print(arrayOfStrings[i] + " ");
            } else {
                System.out.print("\n" + arrayOfStrings[i] + " ");
            }
        }
    }
}
