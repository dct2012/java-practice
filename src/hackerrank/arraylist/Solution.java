package hackerrank.arraylist;

import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        int n = scanner.nextInt();

        ArrayList<Integer>[] al = new ArrayList[n];

        for (int i = 0; i < n; i++) {
            al[i] = new ArrayList<Integer>();

            int d = scanner.nextInt();
            for (int j = 0; j < d; j++) {
                al[i].add(scanner.nextInt());
            }
        }

        int q = scanner.nextInt();

        for (int i = 0; i < q; i++) {
            int x = scanner.nextInt() - 1;
            int y = scanner.nextInt() - 1;

            try {
                System.out.println(al[x].get(y));
            } catch (Exception e) {
                System.out.println("ERROR!");
            }
        }
    }
}