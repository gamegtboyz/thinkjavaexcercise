package chapter7_arrayandreferences;

import java.util.Arrays;

public class Primefactors {
    public static void main(String[] args) {
        int[] ary = {2, 4, 6, 8, 10, 12};
        System.out.println(arePrimeFactors(ary, 2));
    }

    public static boolean arePrimeFactors(int[] a, int b) {
        //build the boolean array to check if 1) all elements in array is prime and 2) all element in array is product of n
        boolean[] checkers = new boolean[2];
        boolean[] allprimes = new boolean[a.length];
        boolean[] products = new boolean[a.length];

        // checker[0] is to check if all elements in array are prime.
        for (int j = 0; j < a.length; j++){ // for each element in array

            // check if each elements contains something equals to 1 or lower which is not the scope of prime number consideration.
            if (a[j] <= 1) {
                //System.out.println("There is integer with lower than prime number scope (1 or something lower), we decide to break this loop.");
                break;
            }

            // this one build the temporary array named 'oneprime' to check if each element is a prime. We minus the element value by 1 which means we exclude the element themselves for consideration.
            boolean[] oneprimes = new boolean[a[j] - 1]; // exclude the element themselves from consideration.
            oneprimes[a[j]-2] = true; // the element themselves always true.

            System.out.println("considering " + a[j]);
            for (int i = 2; i < a[j]; i++) { // try to divide each element with each integer starts from 2 and less than themselves.

                if (a[j] % i != 0) {
                    oneprimes[i-2] = true; // since we start i with 2, we have to minus index [i] with 2 to convert the calculation onto the right index.
                }
            }
            System.out.println("oneprime[] of " + a[j] + " = " + Arrays.toString(oneprimes));

            // before the new iteration of oneprime[] we have to check if that element is prime.
            for (int k = 0; k < oneprimes.length; k++) {
                if (oneprimes[k] == false) { // iterates each element of oneprime[]. if there's any false boolean, the element is not prime, then break the further consideration.
                    allprimes[j] = false;
                    break;
                } else {
                    allprimes[j] = true; // if there's no anything else (break; is not triggered) we consider that the element is prime.
                }
            }
        }
        System.out.println("allprimes[] = " + Arrays.toString(allprimes));

        for (int l = 0; l < allprimes.length; l++) {
            //System.out.println("allprimes " + l + " = " + allprimes[l]);
            if (allprimes[l] == false) { // iterates each element of allprimes[] if it's false, we consider that not all values is prime. Then break.
                checkers[0] = false;
                break;
            } else {
                checkers[0] = true;
            }
        }


        // checker[1] is to check if all elements in array are product of argument b
        for(int j = 0; j < a.length; j++) {
            if (a[j] % b == 0) {
                products[j] = true;
            }
        }

        System.out.println("products[] = " + Arrays.toString(products));
        for(boolean product : products) {
            if (product == false) {
                checkers[1] = false;
                break;
            } else {
                checkers[1] = true;
            }
        }

        // this one is to check if all criteria required in method is true.
        System.out.println("checkers = " + Arrays.toString(checkers));
        for (boolean checker : checkers) {
            if (checker == false) {
                return false;
            }
        }
        return true;
    }
}


