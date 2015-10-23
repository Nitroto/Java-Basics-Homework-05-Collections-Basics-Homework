/**
 * Write a program that reads two lists of letters l1 and l2 and combines them: appends all letters c from l2 to the
 * end of l1, but only when c does not appear in l1. Print the obtained combined list. All lists are given as sequence
 * of letters separated by a single space, each at a separate line. Use ArrayList<Character> of chars to keep the input
 * and output lists.
 */

import org.apache.commons.lang3.ArrayUtils;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class CombineListsOfLetters {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        // to work we need an external library apache commons language http://apache.cbox.biz//commons/lang/binaries/commons-lang3-3.4-bin.tar.gz
        Character[] firstInput = ArrayUtils.toObject(input.nextLine().replaceAll("\\s", "").toCharArray());
        Character[] secondInput = ArrayUtils.toObject(input.nextLine().replaceAll("\\s", "").toCharArray());

        List<Character> firstList = toList(firstInput);
        List<Character> secondList = toList(secondInput);

        secondList.removeAll(firstList);
        firstList.addAll(secondList);

        System.out.println(firstList.toString().toString().replaceAll("\\[|\\]|,", ""));
    }

    public static <E> ArrayList<E> toList(E[] input) {
        ArrayList<E> output = new ArrayList<>();
        for (int i = 0; i < input.length; i++) {
            output.add(input[i]);
        }

        return output;
    }
}
