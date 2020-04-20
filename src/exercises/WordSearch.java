package exercises;

import java.util.Scanner;

public class WordSearch {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        String paragraph = "Alice was beginning to get very tired of sitting by her sister on the bank, " +
                "and of having nothing to do: once or twice she had peeped into the book her sister was reading, " +
                "but it had no pictures or conversations in it, 'and what is the use of a book,' " +
                "thought Alice 'without pictures or conversation?";

        System.out.println("I have a secret paragraph, can you guess " +
                "a word that's included?\n" +"Place your guess here: ");
        String userGuess = input.nextLine();

        boolean search = paragraph.toLowerCase().contains(userGuess.toLowerCase());

        input.close();

        if (search) {
            int index = paragraph.indexOf(userGuess);
//            int length = paragraph.length(userGuess);
            String[] newParagraph = paragraph.split(userGuess);
            System.out.println("Hooray! You guessed correctly!" +
                    "Your guess was at index " + index +
                    "and it had a length of " +
                    "\n For fun, here's the original with your word removed: " + newParagraph);
        } else {
            System.out.println("Oh no! Better luck next time.");
        }
    }
}
