package hackerrank.bitset;

import java.util.BitSet;
import java.util.Scanner;

public class Solution {

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        int n = scanner.nextInt();
        int m = scanner.nextInt();

        BitSet[] b = {new BitSet(n), new BitSet(n)};

        scanner.nextLine();

        for (int i = 0; i < m; i++) {
            String[] cmd = scanner.nextLine().split(" ");

            if (cmd[0].compareTo("AND") == 0) {
                b[Integer.parseInt(cmd[1]) - 1].and(b[Integer.parseInt(cmd[2]) - 1]);
            } else if (cmd[0].compareTo("OR") == 0) {
                b[Integer.parseInt(cmd[1]) - 1].or(b[Integer.parseInt(cmd[2]) - 1]);
            } else if (cmd[0].compareTo("XOR") == 0) {
                b[Integer.parseInt(cmd[1]) - 1].xor(b[Integer.parseInt(cmd[2]) - 1]);
            } else if (cmd[0].compareTo("FLIP") == 0) {
                b[Integer.parseInt(cmd[1]) - 1].flip(Integer.parseInt(cmd[2]));
            } else {
                b[Integer.parseInt(cmd[1]) - 1].set(Integer.parseInt(cmd[2]));
            }

            System.out.printf("%d %d%n", b[0].cardinality(), b[1].cardinality());
        }
    }
}