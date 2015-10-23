/**
 * Write a program to find all increasing sequences inside an array of integers. The integers are given in a single
 * line, separated by a space. Print the sequences in the order of their appearance in the input array, each at a
 * single line. Separate the sequence elements by a space. Find also the longest increasing sequence and print it
 * at the last line. If several sequences have the same longest length, print the leftmost of them.
 */

import java.util.*;

public class LongestIncreasingSequence {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String[] userInput = input.nextLine().split(" ");
        Integer[] arrayOfNumbers = new Integer[userInput.length];
        for (int i = 0; i < arrayOfNumbers.length; i++) {
            arrayOfNumbers[i] = Integer.parseInt(userInput[i]);
        }

        List<List<Integer>> subsets = getSubsets(arrayOfNumbers);
        List<Integer> longestSequence = subsets.get(0);

        for (int i = 0; i < subsets.size(); i++) {
            System.out.println(subsets.get(i).toString().replaceAll("\\[|\\]", ""));
            if (longestSequence.size() < subsets.get(i).size()) {
                longestSequence = subsets.get(i);
            }
        }

        System.out.printf("Longest: %s\n", longestSequence.toString().replaceAll("\\[|\\]", ""));
    }

    public static List<List<Integer>> getSubsets(Integer[] set) {
        List<List<Integer>> subsets = new ArrayList<>();
        for (int i = 0, j = 0; j < set.length; i++, j++) {
            subsets.add(new ArrayList<>());
            subsets.get(i).add(set[j]);

            for (; j < set.length - 1; j++) {
                if (set[j] < set[j + 1]) {
                    subsets.get(i).add(set[j + 1]);
                } else {
                    break;
                }
            }
        }

        return subsets;
    }
}
