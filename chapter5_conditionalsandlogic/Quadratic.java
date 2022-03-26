package chapter5_conditionalsandlogic;

import java.util.Scanner;

public class Quadratic {
    public static void main(String[] args) {

        //this code is according to exercise 5.6 which told us to find the roots called x using the quadratic formula

        Scanner p = new Scanner(System.in);
        Scanner q = new Scanner(System.in);
        Scanner r = new Scanner(System.in);

        System.out.print("Please input a constant: ");
        double a = p.nextDouble();

        System.out.print("Please input b constant: ");
        double b = q.nextDouble();

        System.out.print("Please input c constant: ");
        double c = r.nextDouble();

        double x1 = (-b + Math.sqrt(Math.pow(b, 2) - (4*(a*c))))/(2*a);
        double x2 = (-b - Math.sqrt(Math.pow(b, 2) - (4*(a*c))))/(2*a);

        //To avoid any exception error, we have to concerned that; the denominator value must not equal to zero, and the results under Math.sqrt method must not be negative values.

        if (Math.pow(b, 2) - (4*(a*c)) < 0) {
            System.out.println("The value under square root must not be lower than zero.");
        } else if (2*a == 0) {
            System.out.println("Denominator must not equal to zero");
        } else {
            System.out.printf("the roots of the given number is %.2f and %.2f", x1, x2);
        }
    }
}
