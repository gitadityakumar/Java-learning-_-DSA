import java.util.Scanner;

public class L3q21 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the number of Fibonacci numbers to generate: ");
        int n = scanner.nextInt();

        if (n <= 0) {
            System.out.println("Please enter a positive integer.");
            return;
        }

        long first = 0;
        long second = 1;

        System.out.print("Fibonacci Series: ");
        //if n>=1 then this is code and this is always true so we can write directly
        System.out.print(first);
        if (n >= 2) {
            System.out.print(second );
        }

        for (int i = 3; i <= n; i++) {
            long next = first + second;
            System.out.print(next + " ");
            first = second;
            second = next;
        }

        scanner.close();
    }
}
