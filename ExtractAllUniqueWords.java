/**
 * At the first line at the console you are given a piece of text. Extract all words from it and print them in
 * alphabetical order. Consider each non-letter character as word separator. Take the repeating words only once.
 * Ignore the character casing. Print the result words in a single line, separated by spaces.
 */

import java.util.*;
import java.util.stream.Collectors;

public class ExtractAllUniqueWords {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String[] text = Arrays.asList(input.nextLine()
                .toLowerCase()
                .split("\\W"))
                .stream()
                .filter(str -> !str.isEmpty())
                .collect(Collectors.toList())
                .toArray(new String[0]);
        HashSet<String> words = new HashSet<>();
        for (String word : text) {
            words.add(word);
        }

        List<String> sortedWords = new ArrayList<>(words);
        Collections.sort(sortedWords);
        System.out.println(sortedWords.toString().toString().replaceAll("\\[|\\]|,", ""));


    }
}
