package chapter6_loopandstrings;

import java.util.Scanner;

public class Mainloop {
    /*
    This code is according to exercise 6.1 of the book.
    I wrote the code below to iterate the given integer by doing either actions;
        - divide the integer by 2 for even.
        - add 1 for odd.
        And so on.

    To enhance from the sample code, I added the for loop as you see in the outermost in 'loop' method.
    This makes the code iterates all the integer started from 2 to integer 'n', which is argument of 'loop' method.
    Also, Scanner class is also added onto 'main' method.
     */
    public static void main(String[] args) {
        Scanner m = new Scanner(System.in);
        System.out.print("Please enter your initial number: ");
        int max = m.nextInt();
        loop(max);
    }

    public static void loop(int n) {
        for (int j = 2; j <= n; j++) {
            int i = j;
            while (i > 1) {
                System.out.printf("%6d", i);
                if (i % 2 == 0) {
                    i = i / 2;
                } else {
                    i = i + 1;
                }
            }
            System.out.println();
        }
    }
}

