package org.launchcode.java.studios.areaofacircle;

import java.util.Scanner;

public class Area {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Do you have a radius to measure? Enter YES or NO");
        String continueProgram = input.nextLine();

//        radius = input.nextInt();
        do {
            System.out.println("Enter the radius: ");
            double radius = input.nextDouble();
            if (radius < 0) {
                String errorMessage = "Please enter a numeric character only.";
                System.out.println(errorMessage);
                continue;
            } else {
                double areaCircle = Circle.getArea(radius);
                System.out.println("The area of a circle with radius " + radius + " is: " + areaCircle);
                continue;
            }
        } while (continueProgram == "YES");

//        double areaCircle = Math.PI * (radius * radius);

        input.close();
    }
}
