/**
 * The Java class `n_to_one_WithoutLoop` recursively prints numbers from a given input down to 1
 * without using loops.
 */

import java.util.Scanner;

public class n_to_one_WithoutLoop {

    public static void printNumbers(int n) {
        if (n > 0) {
            System.out.println(n);
            printNumbers(n - 1);
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number: ");
        int num = sc.nextInt();
        printNumbers(num);
        sc.close();
    }
}
