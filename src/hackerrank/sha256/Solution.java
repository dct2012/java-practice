package hackerrank.sha256;

import java.math.BigInteger;
import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import java.util.Scanner;

public class Solution {

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        try {
            String input = scanner.nextLine();
            MessageDigest md = MessageDigest.getInstance("SHA-256");
            byte[] b = md.digest(input.getBytes(StandardCharsets.UTF_8));
            BigInteger num = new BigInteger(1, b);
            StringBuilder sb = new StringBuilder(num.toString(16));

            while (sb.length() < 64) {
                sb.insert(0, '0');
            }

            System.out.println(sb.toString());
        } catch (Exception e) {
            System.out.println("");
        }
    }
}