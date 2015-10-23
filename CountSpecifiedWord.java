/**
 * Write a program to find how many times a word appears in given text. The text is given at the first input line.
 * The target word is given at the second input line. The output is an integer number. Please ignore the character
 * casing. Consider that any non-letter character is a word separator.
 */

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class CountSpecifiedWord {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String text = input.nextLine().toLowerCase();
        String word = input.nextLine().toLowerCase();

        Pattern lookFor = Pattern.compile("\\b" + word + "\\b");
        Matcher matcher = lookFor.matcher(text);
        int wordCount = 0;

        while (matcher.find()) {
            wordCount++;
        }

        System.out.println(wordCount);
    }
}
