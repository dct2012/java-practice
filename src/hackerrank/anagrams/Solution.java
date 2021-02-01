package hackerrank.anagrams;

import java.util.Scanner;

public class Solution {

    static boolean isAnagram(String a, String b) {
        if(a.length() != b.length()) {
            return false;
        }

        a = a.toLowerCase();
        b = b.toLowerCase();

        StringBuilder sb = new StringBuilder(b);

        for(int i = 0; i < a.length(); i++) {
            char current = a.charAt(i);
            int index = b.indexOf(current);

            if (index == -1) {
                return false;
            }

            sb.deleteCharAt(index);
            b = sb.toString();
        }

        return true;
    }

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        String a = scan.next();
        String b = scan.next();
        scan.close();
        boolean ret = isAnagram(a, b);
        System.out.println( (ret) ? "Anagrams" : "Not Anagrams" );
    }
}