package chapter7_arrayandreferences;


import java.util.Arrays;

public class Sieve {
    public static void main(String[] args) {
        System.out.print(sieve(8));
    }

    public static boolean sieve(int n) {
        boolean[] primes = new boolean[n];
        primes[0] = true;
        primes[1] = true;

        for(int i = 2; i < n; i++) {
            //System.out.println("Modding " + n + " with " + i);
            if( n % i != 0) {
                  primes[i] = true;
              }
            //System.out.println("Mod = " + n%i + ", the result is " + primes[i]);
        }

        //System.out.println(Arrays.toString(primes));

        for (boolean prime : primes) {
            if (prime == false) {
                return false;
            }
        }
        return true;
    }
}
