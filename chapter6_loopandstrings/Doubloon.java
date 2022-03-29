package chapter6_loopandstrings;

import java.util.Scanner;

public class Doubloon {
    // this code is according to
    public static void main(String[] args) {
        Scanner t = new Scanner(System.in);
        System.out.print("Please enter your text to check if it's doubloon: ");
        String text = t.nextLine();
        isDoubloon(text);
    }

    public static void isDoubloon(String a) {
        // we supposed to use nested loops for this one
        String lowertext = a.toLowerCase();
        boolean bool = true;

        for (char p = 'a'; p <= 'z'; p++) {
            int count = 0;
            for (int q = 0; q < lowertext.length(); q++) {
                char r = lowertext.charAt(q);
                if (r == p) {
                    count++;
                }
            }
            System.out.println(p + " " + count);
            if (count == 1 || count >= 3) {
                bool = false;
            }
        }
        System.out.println(bool);
    }
}
