package hackerrank.md5;

import java.io.*;
import java.math.BigInteger;
import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import java.util.*;

public class Solution {

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        try {
            String input = scanner.nextLine();
            MessageDigest md = MessageDigest.getInstance("MD5");
            md.update(StandardCharsets.UTF_8.encode(input));
            System.out.println(String.format("%032x", new BigInteger(1, md.digest())));
        } catch (Exception e) {
            System.out.println("");
        }
    }
}