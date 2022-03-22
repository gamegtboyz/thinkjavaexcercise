package chapter3_inputandoutput;

import java.util.Scanner;

// this is according to exercise 3.2 which obtains the integer as celsius and convert it into fahrenheit.
public class CelsiusToFahrenheitCalculator {
    public static void main(String[] data) {
        Scanner key = new Scanner(System.in);
        System.out.print("Enter your celsius to convert:");
        double celsius = key.nextDouble();
        double fahrenheit = (celsius*(9.0/5.0))+32;  //(9.0/5.0) must be double otherwise it will calculate 9/5 as 1 and makes the results incorrect.
        System.out.println("The farenheit equivalent is: " + fahrenheit);
    }
}
