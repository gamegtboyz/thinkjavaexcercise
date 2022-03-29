package chapter6_loopandstrings;

import java.util.Scanner;

public class Stringanalyzer {
    public static void main(String[] args) {

        // this code is not according to any exercise in textbook, but we wrote it according to lesson.

        // this one is to stream 1 string input from keeb
        Scanner f = new Scanner(System.in);
        System.out.print("Please enter your name of favorite fruit: ");
        String fruit = f.nextLine();

        // this code is to spell it again with few spaces
        for (int k = 0; k < fruit.length(); k++) {
            char letter = fruit.charAt(k);  //charAt(int index); method is return the character of input text with specified index, we use this method with for loop to iterate each character from variable 'fruit'.
            System.out.print(letter + " ");
        }
        System.out.println();

        // this code is to spell it backwards
        for (int k = (fruit.length()-1); k >= 0; k--) {
            char letter = fruit.charAt(k);
            System.out.print(letter + " ");
        }
        System.out.println();

        // this code is to return indices of the specified characters
        Scanner i = new Scanner(System.in);
        System.out.print("Which character do you want to find in \"" + fruit + "\": ");
        String find = i.nextLine(); // find contains specified character to find.

        int q = 0;
        int p = 0;

        System.out.print("Text you're looking for appears on index of ");
        while(q < fruit.length() && q != -1) {
            q = fruit.indexOf(find, p); // update q value
            p = q + 1; // update p value
            if (q == -1) {
                break;  // if we found that indexOf() returns -1 which means there's no more specified character to find, the loop ends.
            }
            System.out.printf("%d, ", q); // print q(what we find) then loop again
        }

        System.out.println();

        // this code is to compare the 2 different string and determine which one comes first in alphabetical order.
        Scanner g = new Scanner(System.in);
        System.out.print("Please mention another fruits you like: ");
        String fruit2 = g.nextLine();

        int diff = fruit.compareTo(fruit2);
        if (diff < 0) {
            System.out.println("Alphabetically, it seems that the first one is come before the other.");
        } else if (diff > 0) {
            System.out.println("Alphabetically, it seems that the second one is come before the first.");
        } else {
            System.out.print("It seems that both of fruits is identical.");
        }
    }
}