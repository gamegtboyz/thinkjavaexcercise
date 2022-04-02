package chapter7_arrayandreferences;

import java.util.Arrays;

public class Letterhist {
    public static void main(String[] args) {
        letterHist("aabbcde"); // length counts all character including spaces.
    }

    public static void letterHist(String a) {
        // to turns input string onto the histogram with 26 buckets from a to z. we should built the bucket first. then if there's the string equal to each buckets, we count the bucket.
        // convert the string to lowercase, then build character array from strings
        String text = a.toLowerCase();
        //System.out.println(text.length());
        char[] textarray = new char[text.length()];
        for (int i = 0; i < text.length(); i++) {
            char textchar = text.charAt(i);
            textarray[i] = textchar;
        }

        System.out.println("textarray[] = " + Arrays.toString(textarray)); // the array of text is now build

        //build the bucket for histogram
        int[] countarray = new int[26]; // statement builds the empty int array with 26 elements.
        //create the count mechanism
        for (int i = 0; i < textarray.length; i++) {
            int index = textarray[i] - 'a';
            countarray[index]++;
        }
        System.out.println("count[] = " + Arrays.toString(countarray));
    }
}
