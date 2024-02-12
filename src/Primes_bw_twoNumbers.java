import java.util.Scanner;

public class Primes_bw_twoNumbers {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the starting number: ");
        int start = input.nextInt();
        System.out.print("Enter the ending number: ");
        int end = input.nextInt();

        System.out.println("Prime numbers between " + start + " and " + end + " are:");
        printPrimes(start, end);
    }

    static void printPrimes(int start, int end) {
        for (int i = start; i <= end; i++) {
            if (isPrime(i)) {
                System.out.println(i);
            }
        }
    }

    static boolean isPrime(int n) {
        if (n <= 1) {
            return false;
        }
        for (int i = 2; i <= Math.sqrt(n); i++) {
            if (n % i == 0) {
                return false;
            }
        }
        return true;
    }
}
