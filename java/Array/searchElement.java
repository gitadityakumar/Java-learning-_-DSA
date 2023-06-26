import java.util.Scanner;

// Qs. Take a matrix as input from the user. Search for a
// given number x and print the indices at which it occurs.
public class searchElement {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int rows = sc.nextInt();
        int cols = sc.nextInt();

        // declaring an array
        int[][] matrix = new int[rows][cols];

        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                matrix[i][j] = sc.nextInt();
            }
        }
        // taking number input
        int x = sc.nextInt();

        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                // compare with x
                if (matrix[i][j] == x) {
                    System.out.println(" x found at location (" + i + ", " + j + ")");

                }
            }
        }

    }
}
