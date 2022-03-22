package chapter3_inputandoutput;

import java.util.Scanner;

// This is the Exercise 3.3 in the book, we obtain the integer figure of seconds. Then, I converted it into an hour, minutes, and seconds.
public class SecondToHourCalculator {
    public static void main(String[] data) {
        //define constants
        final int SEC_PER_HR = 3600;
        final int SEC_PER_MIN = 60;

        //write the code, we obtain information from system.in, then process and return the calculated value

        Scanner sec = new Scanner(System.in);
        System.out.print("Please enter your seconds to calculate:");
        int seconds = sec.nextInt();

        int usedhour = seconds/SEC_PER_HR;
        int usedmin = (seconds%SEC_PER_HR)/SEC_PER_MIN;
        int usedsec = seconds%SEC_PER_MIN;

        System.out.printf("your used time is %,d hour, %d minutes, and %d seconds", usedhour, usedmin, usedsec);
    }
}
