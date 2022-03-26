package chapter5_conditionalsandlogic;

import java.util.Scanner;

public class Triangle {
    // this code is according to exercise 5.7 which told us to find out if three given length could form the triangle
    public static void main(String[] args) {
        Scanner one = new Scanner(System.in);
        Scanner two = new Scanner(System.in);
        Scanner three = new Scanner(System.in);

        System.out.print("Please insert the length of 1st sticks: ");
        double a = one.nextDouble();

        System.out.print("Please insert the length of 2nd sticks: ");
        double b = two.nextDouble();

        System.out.print("Please insert the length of 3rd sticks: ");
        double c = three.nextDouble();

        // to form any triangle, we need to check if each length must not greater than sum of the other two.
        if (a >= (b+c) || b >= (c+a) || c >= (a+b)) {
            System.out.println("The given length could not form any triangle.");
        } else {
            System.out.println("Great! these given length could form triangle.");
        }
    }
}
