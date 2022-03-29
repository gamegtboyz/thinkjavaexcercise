package chapter6_loopandstrings;

import java.util.Scanner;

public class Abecedarian {
    // this code is according to exercise 6.5 which received a string and find out if it's Abecedarian words (words written in alphabetical order).
    public static void main(String[] args) {
        Scanner t = new Scanner(System.in);
        System.out.print("Please enter your words to find out if it's Abecedarian words: ");
        String text = t.nextLine();
        isAbecedarian(text);
    }

    public static void isAbecedarian(String a) {
        int increment = 0;
        boolean boo;
        for (int k = 0; k < a.length() - 1; k++) {
            char p = a.charAt(k);
            char q = a.charAt(k+1);
            increment = q - p;
            if (increment < 0) {
                break;
            }
        }
        if (increment < 0) {
            boo = false;
        } else {
            boo = true;
        }
        System.out.println(boo);
    }
}
