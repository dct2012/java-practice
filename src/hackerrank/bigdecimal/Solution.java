package hackerrank.bigdecimal;

import java.math.BigDecimal;
import java.math.BigInteger;
import java.util.Scanner;

public class Solution {

    public static void main(String[] args) {
        //Input
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        String[] s = new String[n + 2];
        for (int i = 0; i < n; i++) {
            s[i] = sc.next();
        }
        sc.close();

        //Write your code here
        for (int i = 0; i < n - 1; i++) {
            BigDecimal current = new BigDecimal(s[i]);
            BigDecimal next = new BigDecimal(s[i + 1]);

            if (next.compareTo(current) > 0) {
                String temp = s[i + 1];
                s[i + 1] = s[i];
                s[i] = temp;

                i = -1;
            }
        }

        //Output
        for (int i = 0; i < n; i++) {
            System.out.println(s[i]);
        }
    }
}