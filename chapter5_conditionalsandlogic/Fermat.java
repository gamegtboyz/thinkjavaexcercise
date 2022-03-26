package chapter5_conditionalsandlogic;

import java.util.Scanner;

public class Fermat {
    // this code is according to exercise 5.3 which told me to check if Fermat's last theorem is work with the given figures.
    public static void main(String[] args) {
        //I write the code that obtain the values; a, b, c, and n with System.in so I have wo write the Scanner class here.
        Scanner p = new Scanner(System.in);
        Scanner q = new Scanner(System.in);
        Scanner r = new Scanner(System.in);
        Scanner s = new Scanner(System.in);

        System.out.println("This code is to calculate and return the results if Fermat's last theorem is works with given figures.");
        System.out.print("Please input a value: ");
        double a = p.nextDouble();

        System.out.print("Please input b value: ");
        double b = q.nextDouble();

        System.out.print("Please input c value: ");
        double c = r.nextDouble();

        System.out.print("Please input n value: ");
        double n = s.nextDouble();

        boolean result = Math.pow(a, n) + Math.pow(b, n) == Math.pow(c, n);

        if (result && n > 2) {
            System.out.println("Holy smokes, Fermat was wrong!");
        } else {
            System.out.println("No, that doesn't work");
        }
    }
}
