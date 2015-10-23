/**
 * Write a program to enter a number n and n integer numbers and sort and print them.
 * Keep the numbers in array of integers: int[].
 */

import java.util.Arrays;
import java.util.Scanner;

public class SortArrayOfNumbers {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int numberOfElements = input.nextInt();
        int[] numbers = new int[numberOfElements];
        for (int i = 0; i < numbers.length; i++) {
            numbers[i] = input.nextInt();
        }

        Arrays.sort(numbers);
        System.out.println(Arrays.toString(numbers));
    }
}
