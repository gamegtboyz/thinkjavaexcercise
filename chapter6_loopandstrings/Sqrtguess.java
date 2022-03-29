package chapter6_loopandstrings;

import java.util.Scanner;

public class Sqrtguess {
    public static void main(String[] args) {
        // this code is to guess the square root of given integer from the formula given in exercise 6.2 of the book.
        Scanner s = new Scanner(System.in);
        System.out.print("Please enter your squared amount you want to guess: ");
        double square = s.nextDouble();
        squareRoot(square);
    }

    public static void squareRoot(double a) {
        double x = a / 2.0;
        double y = 0.0;
        double diff = Math.abs(y-x);
        int i = 0;

        while(diff > 0.0001) {
            y = (x + (a / x)) / 2;
            diff = Math.abs(y - x);
            x = y;
            i++;
        }
        System.out.printf("Guessed result is %f8", x);
        System.out.println();
        System.out.println("This method iterated the result for " + i + " times.");
    }
}
