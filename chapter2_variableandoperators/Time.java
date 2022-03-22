package chapter2_variableandoperators;

public class Time {
    public static void main(String[] data) {

        //assign the constants
        final int SEC_PER_HRS = 3600;
        final int SEC_PER_MIN = 60;

        // assign the variables
        int hour1 = 14;
        int minute1 = 31;
        int second1 = 25;

        //display the time
        System.out.println(hour1+":"+minute1+":"+second1);

        //calculate seconds since midnight
        int sincemidnight = (hour1*SEC_PER_HRS) + (minute1*SEC_PER_MIN) + second1;
        System.out.printf("Since the last midnight, the time passed by %,d seconds.", sincemidnight);
        System.out.println();

        //calculate seconds until another midnight
        int tillmidnight = (24*SEC_PER_HRS) - sincemidnight;
        System.out.printf("Until the next midnight, we still have %,d seconds from now on.", tillmidnight);
        System.out.println();

        //calculate the percentage of the day passed
        System.out.printf("At the moment, we wasted the time of the day by %.2f percent.", (((double)sincemidnight/(double)(24*SEC_PER_HRS))*100));
        System.out.println();

        //calculate the time elapsed writing this code
        int hour2 = 15;
        int minute2 = 22;
        int second2 = 40;

        int timewasted = ((hour2*SEC_PER_HRS) + (minute2*SEC_PER_MIN) + second2) - sincemidnight;
        int hourwasted = timewasted/SEC_PER_HRS;
        int minwasted = (timewasted%SEC_PER_HRS)/SEC_PER_MIN;
        int secwasted = (timewasted%SEC_PER_MIN);

        System.out.printf("Until now, we wasted %,d seconds to write this entire code", timewasted); //this line calculate the elapsed time in plain second format
        System.out.printf(", which is calculated into %d hours, %d minutes, and %d seconds.", hourwasted, minwasted, secwasted); //this line calculate the elapsed time in hours, minutes, and seconds.
    }
}
