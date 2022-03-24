package chapter4_methodandtesting;

public class Multadd {
    public static void multadd(double a, double b, double c) {
        System.out.println((a*b)+c);
    }

    public static void expSum(double x) {
        multadd(1.0, (x*Math.exp(-x)), Math.sqrt((1.0-Math.exp(-x))));
    }

    public static void main(String[] args) {
        multadd(1.0, 2.0, 3.0);
        multadd(1.0, Math.sin(45), (Math.cos(45)/2));
        multadd(1.0, Math.log(10), Math.log(20));
    }
}
