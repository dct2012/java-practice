package hackerrank.subarray;

import java.math.BigInteger;
import java.util.Scanner;

public class Solution {

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        int n = scanner.nextInt();
        int[] a = new int[n];

        for (int i = 0; i < n; i++) {
            a[i] = scanner.nextInt();
        }

        int count = 0;

        for (int w = 1; w <= n; w++) {
            for (int i = 0; i <= n -w; i++) {
                int sum = 0;
                for (int x = 0; x < w; x++) {
                    sum += a[i+x];
                }
                if (sum < 0) {
                    count++;
                }
            }
        }

        System.out.println(count);
    }
}