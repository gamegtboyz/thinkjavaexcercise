package chapter7_arrayandreferences;

import java.util.Arrays;
import java.util.Scanner;

public class ArrayTransverse {

    public static void main(String[] args) {

        /*
        [[ This one is illustration of transversing each array element by themselves]]

        int[] a = {1, 2, 3, 4};
        System.out.println(Arrays.toString(a));

        //transverse by made it multiple themselves
        for(int i = 0; i < a.length; i++) {
            a[i] *= a[i];
        }
        System.out.println(Arrays.toString(a));
        */

        /*
        [[ The code below is illustration of using the custom method named 'search' to find the given value in the array.]]
        double[] a = {1.0, 2.0, 3.0, 4.0};
        System.out.print(search(a, 5.0));
         */

        double[] a = {6.0, 2.0, 3.0, 4.0, 7.0};
        System.out.println(sum(a));
        System.out.println(average(a));
        System.out.println(max(a));
    }

    public static boolean search(double[] array, double find) {
        // this method is built to find 1 double in double array. If the given double is not found in array, it returns -1.
            for (int i = 0; i < array.length; i++) {
                if(array[i] == find) {
                    return true; // in the for loop (a.k.a. during search), if there's element equals to find, returns true.
                }
            }
            return false; // at the end of loop (a.k.a. after the search), if there's no elements equals to find, returns false.
    }

    public static double sum(double[] array) {
        // this method is to summarize all values in double array and returns the results as double.
        double total = 0.0;
        for (int i = 0; i < array.length; i++) {
            total += array[i];
        }
        return total;
    }

    public static double average(double[] array) {
        // this method is to find the average values in double array and return the results as double.
        double sum = 0.0;
        int count = 0;
        for (int i = 0; i < array.length; i++) {
            sum += array[i];
            count++;
        }
        return sum/count;
    }

    public static double max(double[] array) {
        // this method is to return the max value in double array and return the results as double.
        double max = 0.0;
        for (int i = 0; i < array.length; i++) {
            if (array[i] > max) {
                max = array[i];
            }
        }
        return max;
    }
}
