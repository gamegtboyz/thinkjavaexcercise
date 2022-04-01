package chapter7_arrayandreferences;

import java.util.Arrays;

public class Factors {
    public static void main(String[] args){

        int[] ary = {3, 6, 9, 13};

        System.out.println(areFactor(ary, 3));
    }

public static boolean areFactor(int[] a, int b) {
        boolean[] factors = new boolean[a.length];

        for (int i = 0; i < a.length; i++) {
            //System.out.println("Modding " + a[i] + " with " + b);
            if (a[i] % b == 0) {
                factors[i] = true;
            }
            //System.out.println("Mod = " + a[i]%b + " the result is " + factors[i]);
        }
        //System.out.println(Arrays.toString(factors));

    for (boolean factor : factors) {
        if (factor == false) {
            return false;
        }
    }
        return true;
    }
}
