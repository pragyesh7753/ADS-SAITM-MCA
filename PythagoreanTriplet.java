import java.util.Scanner;

public class PythagoreanTriplet {
    public static void isTriplet(int a, int b, int c) {
        if (a * a + b * b == c * c || a * a + c * c == b * b || b * b + c * c == a * a) {
            System.out.println("Hurray! It is a Pythagorean Triplet");
        } else {
            System.out.println("Oops! It is not a Pythagorean Triplet");
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the three numbers one-by-one: ");
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();
        isTriplet(a, b, c);
    }
}
