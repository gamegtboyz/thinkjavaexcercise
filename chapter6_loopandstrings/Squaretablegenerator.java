package chapter6_loopandstrings;

import java.util.Scanner;

public class Squaretablegenerator {
    public static void main(String[] args) {
        //this code is not according to any exercise in the book. This is just illustration of using Scanner class with nested loops.
        Scanner s = new Scanner(System.in);
        System.out.print("Please enter the number you wanted to square: ");
        int square = s.nextInt();

        for (int i = 1; i <= square; i++) {
            for (int j = 1; j <= square; j++) {
                System.out.printf("%6d", i*j);
            }
            System.out.println();
        }
    }
}
