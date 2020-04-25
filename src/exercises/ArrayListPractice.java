package exercises;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class ArrayListPractice {
    public static void main(String[] args) {

        ArrayList<Integer> arrList = new ArrayList<>(Arrays.asList(5, 8, 58, 649, 1, 78, 900, 50, 27, 22, 34, 56));
        int sumOfEvens = 0;

        for (int i = 0; i <= arrList.size(); i++) {
            if (arrList.get(i) % 2 == 0) {
                sumOfEvens += arrList.get(i);
            }
        }
        System.out.println(sumOfEvens);
    }
}
