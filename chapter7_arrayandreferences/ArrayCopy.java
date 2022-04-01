package chapter7_arrayandreferences;

import java.util.Arrays;

public class ArrayCopy {
    public static void main(String[] args) {
        // this one is to illustrate how to copy an array without effect of mutation of one to the other.
        // build int array of a and b. a is the empty array with 4 slots, b is the identical to a
        int[] a = new int[4];

        // 3rd approach: use Array.copyOf() method to copy the array with specified length.
        int[] b = Arrays.copyOf(a,2);

        /*
        1st approach: assign b equals to a. This one is not the good way since b shares the same memory of each element to a. Made b exposed to mutation of a.
         */

        /* the 2nd approach: built the for loop to assign the value to array b
        for (int i = 0; i < b.length; i++) {
            b[i] = a[i];
        }
         */

        //mutate the elements in a
        a[0] = 3;
        a[1] = 4;
        a[2] = 5;

        System.out.println(Arrays.toString(a));
        System.out.println(Arrays.toString(b));

        //
    }
}
