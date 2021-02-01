package hackerrank.list;

import java.math.BigInteger;
import java.util.ArrayList;
import java.util.Scanner;

public class Solution {

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        ArrayList<Integer> a = new ArrayList<>();

        int n = scanner.nextInt();
        for (int i = 0; i < n; i++) {
            a.add(scanner.nextInt());
        }

        int q = scanner.nextInt();
        for (int i = 0; i < q; i++) {
            scanner.nextLine();

            String command = scanner.nextLine();
            if (command.compareTo("Insert") == 0) {
                int index = scanner.nextInt();
                int num = scanner.nextInt();

                System.out.println("inserting " + num + " at " + index);
                if (index < a.size()) {
                    a.add(index, num);
                } else {
                    a.add(num);
                }
            } else {
                int index = scanner.nextInt();
                System.out.println("Removing at " + index);
                a.remove(index);
            }
        }

        for (int i = 0; i < n; i++) {
            System.out.print(a.get(i));
            if (i + 1 != n) {
                System.out.print(" ");
            }
        }
        System.out.println();
    }
}