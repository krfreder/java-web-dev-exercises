package exercises;

import java.util.Scanner;

public class MilesPerGallon {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Enter the amount of miles you've driven: ");
        double miles = input.nextInt();

        System.out.println("Enter how many gallons of gas used: ");
        double gas = input.nextInt();

        double mpg = miles / gas;

        input.close();
        System.out.println("Your miles-per-gallon is: " + mpg);
    }
}
