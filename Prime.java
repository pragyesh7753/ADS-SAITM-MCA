import java.util.Scanner;

public class Prime {
    public static void printPrimes(int start, int end) {
        for (int i = start; i <= end; i++) {
            if (isPrime(i)) {
                System.out.print(i+" ");
            }
        }
    }

    public static boolean isPrime(int n) {
        int prime = 0;
        for (int i = 1; i <= n; i++) {
            if (n % i == 0) {
                prime++;
            }
        }

        if (prime == 2) {
            return true;
        } else {
            return false;
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter first number: ");
        int first = sc.nextInt();
        System.out.print("Enter second number: ");
        int second = sc.nextInt();
        printPrimes(first, second);
        sc.close();
    }
}
