package hackerrank.endoffile;

import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        for (int i = 1; sc.hasNext(); i++) {
            System.out.printf("%d %s%n", i, sc.nextLine());
        }
    }
}