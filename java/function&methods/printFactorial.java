import java.util.Scanner;

public class printFactorial {
    // Method to calculate and print the factorial of a number
    public static void factorial(int n) {
        // Check if the number is negative
        if (n < 0) {
            System.out.println("Invalid number");
            return; // Exit the method if the number is invalid
        }

        int fact = 1; // Initialize a variable to store the factorial

        // Loop to calculate the factorial
        for (int i = n; i >= 1; i--) {
            fact = fact * i;
        }

        System.out.println(fact); // Print the factorial
        return; // Exit the method
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt(); // Read the input number from the user

        factorial(n); // Call the factorial method with the input number
    }
}
