/**
 * TowerOfHanoi
 */
public class TowerOfHanoi {

    public static void solveHanoi(int n, char fromPeg, char toPeg, char auxPeg) {
        if (n == 1) {
            System.out.println("Move disk 1 from " + fromPeg + " to " + toPeg);
            return;
        }

        solveHanoi(n - 1, fromPeg, auxPeg, toPeg);

        System.out.println("Move disk " + n + " from " + fromPeg + " to " + toPeg);

        solveHanoi(n - 1, auxPeg, toPeg, fromPeg);
    }

    public static void main(String[] args) {
        int numberOfDisks = 3;
        System.out.println("Steps to solve Tower Of Hanoi with " + numberOfDisks + " disks: ");
        solveHanoi(numberOfDisks, 'A', 'C', 'B');
    }
}