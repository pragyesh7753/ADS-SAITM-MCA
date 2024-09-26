import java.util.Scanner;

public class SumNaturalNumbers {

    int sum = 0;

    public static int sumOfNaturalNumbers(int n) {
        if (n == 0) {
            return 0;
        } else {
            return n + sumOfNaturalNumbers(n - 1);
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the value of n: ");
        int n = sc.nextInt();
        System.out.println("The sum of first " + n + " natural numbers is: " + sumOfNaturalNumbers(n));
    }
}
