/**
 * We are given a sequence of N playing cards from a standard deck. The input consists of several cards (face + suit),
 * separated by a space. Write a program to calculate and print at the console the frequency of each card face in
 * format "card_face -> frequency". The frequency is calculated by the formula appearances / N and is expressed in
 * percentages with exactly 2 digits after the decimal point. The card faces with their frequency should be printed in
 * the order of the card face's first appearance in the input. The same card can appear multiple times in the input,
 * but it's face should be listed only once in the output.
 */

import java.util.Arrays;
import java.util.LinkedHashMap;
import java.util.Scanner;
import java.util.stream.Collectors;

public class CardsFrequencies {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String[] cards = Arrays.asList(input.nextLine()
                .split(" "))
                .stream()
                .filter(str -> !str.isEmpty())
                .collect(Collectors.toList())
                .toArray(new String[0]);
        int numberOfCards = cards.length;

        LinkedHashMap<String, Integer> hand = new LinkedHashMap<>();
        for (String card : cards) {
            String face = card.substring(0, card.length() - 1);

            if (hand.containsKey(face)) {
                hand.put(face, hand.get(face) + 1);
            } else {
                hand.put(face, 1);
            }
        }
        for (String face : hand.keySet()) {
            double percentage = (hand.get(face) * 100.0) / numberOfCards;
            System.out.printf("%s -> %.2f%%\n", face, percentage);
        }
    }
}
