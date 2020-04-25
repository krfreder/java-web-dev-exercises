package exercises;

import java.util.Arrays;

public class ArrayPractice {
    public static void main(String[] args) {

        Integer[] values = {1, 2, 1, 3, 5, 8};
        for (int i : values) {
            if (i % 2 != 0){
                System.out.print(i);
            }
        }

        String str = "I would not, could not, in a box. I would not, could not with a fox. I will not eat them in a house. I will not eat them with a mouse.";
        String[] splitStr = str.split(" ");
        System.out.println(Arrays.toString(splitStr));

        String strTwo = "I would not, could not, in a box. I would not, could not with a fox. I will not eat them in a house. I will not eat them with a mouse.";
        String[] splitStrTwo = str.split("\\.");
        System.out.println(Arrays.toString(splitStrTwo));
    }
}
