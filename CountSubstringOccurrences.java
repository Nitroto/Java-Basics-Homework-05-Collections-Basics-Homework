/**
 * Write a program to find how many times given string appears in given text as substring. The text is given at the
 * first input line. The search string is given at the second input line. The output is an integer number. Please
 * ignore the character casing.
 */

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class CountSubstringOccurrences {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String text = input.nextLine().toLowerCase();
        String substring = input.nextLine().toLowerCase();

        Pattern lookFor = Pattern.compile(substring);
        Matcher matcher = lookFor.matcher(text);
        int substringCount = 0;

        // check for substring including overlapping
        boolean found = matcher.find();
        while (found) {
            substringCount++;
            // search starting after the last match began
            found = matcher.find(matcher.start() + 1);
        }

        System.out.println(substringCount);
    }
}
