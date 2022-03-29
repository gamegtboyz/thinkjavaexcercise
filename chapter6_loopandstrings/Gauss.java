package chapter6_loopandstrings;

public class Gauss {
    // this code is to evaluate the exponential of (-x)^2 with infinite series expansion.
    public static void main(String[] args) {
        gauss(2, 3);
    }

    public static void gauss(double a, double b) {
        double i = a;
        double j = b;
        double k = 0;
        for (j = 0; j <= b; j++) {
            k = k + ((pow(1.0, j)) * (pow(i, 2.0*j)) / fact(j));
        }
        System.out.println(k);
    }

    // the method 'fact' is written to return the factorial of given integers
    public static double fact(double c) {
        double i = c;
        double f = 1;
        while (i > 0) {
            f = f * i;
            i--;
        }
        return f;
    }

    // this method 'pow' is written to calculate the power of 2 given integers
    public static double pow (double a, double b) {
        double i = a;
        double j = b;
        double p = 1;
        if (j != 0) {
            for (j = 0; j <= b; j++) {
                p = p * i;
                j++;
            }
        } else {
            p = 1;
        }
        return p;
    }
}