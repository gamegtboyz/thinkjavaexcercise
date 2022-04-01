package chapter7_arrayandreferences;

import java.util.Arrays;
import java.util.Random;

public class Indexofmax {
    public static void main(String[] args) {

        int[] a = new int[10];

        Random s = new Random();
        for (int i = 0; i < a.length; i++) {
            a[i] = s.nextInt(100);
        }

        System.out.println(a.length);
        System.out.println(Arrays.toString(a));
        System.out.println(indexOfMax(a));
        System.out.println(a[indexOfMax(a)]);
    }

    public static int indexOfMax(int[] array) {
        int max = 0;
        int imax = 0;
        for (int i = 0; i < array.length; i++) {
            //System.out.println("considering on index " + i + "(" + array[i] +")" + " compared to index " + (i-1) + "(" + array[(i-1)] +")");
            if (array[i] > max) {
                max = array[i];
                imax = i;
            }
            //System.out.println("max = " + max);
        }
        return imax;
    }
}
