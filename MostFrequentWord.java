/**
 * Write a program to find the most frequent word in a text and print it, as well as how many times it appears in
 * format "word -> count". Consider any non-letter character as a word separator. Ignore the character casing. If
 * several words have the same maximal frequency, print all of them in alphabetical order.
 */

import java.util.*;
import java.util.stream.Collectors;

public class MostFrequentWord {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String[] text = Arrays.asList(input.nextLine()
                .toLowerCase()
                .split("\\W"))
                .stream()
                .filter(str -> !str.isEmpty())
                .collect(Collectors.toList())
                .toArray(new String[0]);
        TreeMap<String, Integer> words = new TreeMap<>();
        int maxRepeats = 0;
        for (int i = 0; i < text.length; i++) {
            if (!words.containsKey(text[i])) {
                int wordCounter = 0;
                for (int j = i; j < text.length; j++) {
                    if (text[i].equals(text[j])) {
                        wordCounter++;
                    }
                }
                if (wordCounter > maxRepeats) {
                    maxRepeats = wordCounter;
                }
                words.put(text[i], wordCounter);
            }
        }

        for (String word : words.keySet()) {
            if (words.get(word) == maxRepeats) {
                System.out.printf("%s -> %d times\n", word, words.get(word));
            }
        }
    }
}
