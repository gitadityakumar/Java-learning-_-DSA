import java.util.Scanner;

public class PrimeChecker {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a number: ");

        int num = scanner.nextInt();
        scanner.close();

        if (num <= 1) {
            System.out.println(num + " is not prime.");
        } else if (num <= 3) {
            System.out.println(num + " is prime.");
        } else if (num % 2 == 0 || num % 3 == 0) {
            System.out.println(num + " is not prime.");
        } else {
            boolean isPrime = true;
            for (int i = 5; i * i <= num; i += 6) {
                if (num % i == 0 || num % (i + 2) == 0) {
                    isPrime = false;
                    break;
                }
            }

            if (isPrime) {
                System.out.println(num + " is prime.");
            } else {
                System.out.println(num + " is not prime.");
            }
        }
    }
}
