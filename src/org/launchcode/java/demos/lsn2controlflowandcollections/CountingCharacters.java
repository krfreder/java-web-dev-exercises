package org.launchcode.java.demos.lsn2controlflowandcollections;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class CountingCharacters {
    public static void main(String[] args) {

//  Prompts user for input and converts input to array.
        Scanner input = new Scanner(System.in);
        System.out.println("Please enter something fun for us to count the letters in: ");
        String prompt = input.nextLine();
        char[] charactersInString = prompt.toUpperCase().toCharArray();
//  Creates HashMap to store data, initializes counter
        HashMap<Character, Integer> characterCounts = new HashMap<Character, Integer>();
        int counter = 0;
//  Loops through array storing letters as keys and counting amount as values. Ignores non-alphabetic characters.
        for (char c: charactersInString) {
            if (!Character.isLetter(c)) {
            } else if (characterCounts.containsKey(c)) {
                counter = characterCounts.get(c) + 1;
                characterCounts.put(c, counter);
            } else {
                characterCounts.put(c, 1);
            }
        }
//  Prints result to screen
        for (Map.Entry<Character, Integer> characters: characterCounts.entrySet()) {
            System.out.println(characters.getKey() + ":" + " " + characters.getValue());
        }
    }
}
