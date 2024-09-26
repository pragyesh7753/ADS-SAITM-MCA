import java.util.Scanner;

public class IsPrime {
    // public static void isPrime(int n) {
    // int prime = 0;
    // for (int i = 1; i <= n; i++) {
    // if (n % i == 0) {
    // prime++;
    // }
    // }

    // if (prime == 2) {
    // System.out.println("Hurray! It's a prime number");
    // } else {
    // System.out.println("Oops! It's not a prime number");
    // }
    // }

    // Another approach
    public static boolean isPrime(int n) {
        for (int i = 2; i < n; i++) {
            if (n <= 1) {
                return false; // 0 and 1 are not prime numbers
            }
            if (n % i == 0) {
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the value of n: ");
        int n = sc.nextInt();
        isPrime(n);
        if (isPrime(n)) {
            System.out.println("Hurray! It's a prime number");
        } else {
            System.out.println("Oops! It's not a prime number");

        }
    }
}
