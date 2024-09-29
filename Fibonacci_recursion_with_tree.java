
import java.util.Scanner;

public class Fibonacci_recursion_with_tree {

    public static int fibonacci(int n) {
        if (n <= 1) {
            return n; // Base case: fibonacci(0) = 0, fibonacci(1) = 1
        }
        // Recursive case
        return fibonacci(n - 1) + fibonacci(n - 2);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number: ");
        int num = sc.nextInt();
        // System.out.println(printFibonacci(num));
        for (int i = 0; i < num; i++) {
            System.out.println(fibonacci(i));
        }
    }
}
