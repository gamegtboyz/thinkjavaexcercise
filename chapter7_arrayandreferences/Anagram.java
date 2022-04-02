package chapter7_arrayandreferences;

import java.util.Arrays;

public class Anagram {
    public static void main(String[] args) {
        System.out.println(isAnagram("Madone", "Domane"));
    }

    public static boolean isAnagram(String a, String b) {
        String lowera = a.toLowerCase();
        String lowerb = b.toLowerCase();

        int[] ahist = new int[26];
        for (int i = 0; i < lowera.length(); i++) {
            char lettera = lowera.charAt(i);
            int indexa = lettera - 'a';
            ahist[indexa]++;
        }

        int[] bhist = new int[26];
        for (int i = 0; i < lowerb.length(); i++) {
            char letterb = lowerb.charAt(i);
            int indexb = letterb -'a';
            bhist[indexb]++;
        }

        System.out.println(Arrays.toString(ahist));
        System.out.println(Arrays.toString(bhist));

        for (int i = 0; i < 26; i++) {
            if (ahist[i] != bhist[i]) {
                return false;
            }
        }
        return true;
    }
}
