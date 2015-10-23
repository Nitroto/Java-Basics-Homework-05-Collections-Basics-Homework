/**
 * Write a program to count the number of words in given sentence. Use any non-letter character as word separator.
 */

import java.util.Arrays;
import java.util.Scanner;
import java.util.stream.Collectors;

public class CountAllWords {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        // Get array of string separated by any character and ignore empty cases.
        String[] userInput = Arrays.asList(input.nextLine()
                .split("\\W"))
                .stream()
                .filter(str -> !str.isEmpty())
                .collect(Collectors.toList())
                .toArray(new String[0]);
        int wordsCount = userInput.length;
        System.out.println(wordsCount);
    }
}
