package chapter4_methodandtesting;

public class Calendar {
    public static void printAmerican(String day, int date, String month, int year) {
        System.out.println(day + ", " + month + " " + date + "," + year);
    }

    public static void printEurope(String day, int date, String month, int year) {
        System.out.println(day + " " + date + " " + month + " " + year);
    }

    public static void main(String[] args) {
        printAmerican("Thursday", 24, "March", 2022);
        printEurope("Thursday", 24, "March", 2022);
    }
}
