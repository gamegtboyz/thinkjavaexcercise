package chapter3_inputandoutput;

import java.util.Random;
import java.util.Scanner;

// This is the Exercise 3.4 in the book. But I added some return of clue and loop of guess to the game.
public class GuessMyNumber {
    public static void main(String[] data) {
        Random r = new Random();
        int rand = r.nextInt(100);

        Scanner g = new Scanner(System.in);
        System.out.print("Guess your number from 0 - 100: ");

        int guess = g.nextInt();
        int i = 1;

        while (guess != rand) {

            if (guess < rand) {
                System.out.println("This is too low, our random number is a bit higher, guess it again.");
                guess = g.nextInt();
            }
            if (guess > rand) {
                System.out.println("This is too high, our random number is a bit lower, guess it again.");
                guess = g.nextInt();
            }

        i = i+1;

        }

        System.out.println("Congratulations! our random number is " + rand + ".");
        System.out.println("You've guessed it for " + i + " times");
    }
}
