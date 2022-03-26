package chapter5_conditionalsandlogic;

public class MergeIf {
    public static void main(String[] args) {
        /*
        This is according to exercise 5.1 which tells me to rewrite the following source code using single if statement.

            if (x > 0) {
                if (x < 10) {
                    System.out.println("positive single digit number");
                }
            }
         */
        int x = 9;
        if (x > 0 && x < 10) {
            System.out.println("positive single digit number");
        }
    }
}
