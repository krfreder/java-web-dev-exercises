package exercises;

import java.util.Scanner;

public class CalculateArea {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("What is the rectangles length: ");
        double length = input.nextInt();

        System.out.println("What is the rectangles width: ");
        double width = input.nextInt();

        double area = length * width;
        input.close();
        System.out.println("The area of your rectangle is: " + area);
    }
}
