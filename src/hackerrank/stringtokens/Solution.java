package hackerrank.stringtokens;

import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String s = scan.nextLine();
        // Write your code here.
        scan.close();

        s = s.trim();
        if (s.length() > 0) {
            String[] output = s.trim().split("[ !,?._'@]+");

            System.out.println(output.length);

            for (String out : output) {
                System.out.println(out);
            }
        } else {
            System.out.println(0);
        }
    }
}

/*
* 8
YES
leading
spaces
are
valid
problemsetters
are
evillllll
* */