package chapter3_inputandoutput;

public class IllegalFormatException {
    public static void main(String[] data) {
        //Excercise 3.1: try to use printf in different data type to the type defined.
        int sample = 1000000;
        double dbl = 33333.33;

        // System.out.printf("%f", sample);
        // System.out.printf("%d", dbl); // these codes will return IllegalFormatConversionException
    }
}
