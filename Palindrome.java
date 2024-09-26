import java.util.Scanner;

public class Palindrome {
    public static void isPalindrome(int n) {
        int reverse = 0;
        int original = n;
        int rem = 0;
        while (n > 0) {
            rem = n % 10;
            reverse = (reverse * 10 + rem);
            n = n / 10;
        }
        if (reverse == original) {
            System.out.println("It's a palindrome number.");
        } else {
            System.out.println("It's not a palindrome number.");
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int n = sc.nextInt();
        isPalindrome(n);
    }
}
