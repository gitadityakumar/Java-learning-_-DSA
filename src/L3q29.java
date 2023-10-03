import java.util.Scanner;

public class L3q29 {
    public static void main(String[] args) {
        // Calculate Average Of N Numbers .
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the number of values to average: ");
        int N = input.nextInt();
        int sum = 0;

        for (int i = 0; i < N; i++) {
            System.out.print("Enter value #" + (i + 1) + ": ");
            int value = input.nextInt();
            sum += value;
        }

        // Calculate and print the average
        double average = (double) sum / N;
        System.out.println("Average: " + average);
    }
}
