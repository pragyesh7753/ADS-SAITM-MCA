import java.util.Scanner;

public class PrimeMethod {
    public static void isPrime(int n) {
        int prime = 0;
        for (int i = 1; i <= n; i++) {
            if (n % i == 0) {
                prime++;
            }
        }

        if (prime == 2) {
            System.out.println("Hurray! It's a prime number");
        } else {
            System.out.println("Oops! It's not a prime number");
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the value of n: ");
        int n = sc.nextInt();
        isPrime(n);
    }
}
