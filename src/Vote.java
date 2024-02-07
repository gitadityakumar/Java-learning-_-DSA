import java.util.Scanner;

public class Vote {
    // A person is eligible to vote if his/her age is greater than or equal to 18.
    // Define a method to find out if he/she is eligible to vote.
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter your age: ");
        int age = input.nextInt();

        if (checkAge(age)) {
            System.out.println("You are eligible to vote.");
        } else {
            System.out.println("You are a minor.");
        }
    }

    static boolean checkAge(int age) {
        return age >= 18;
    }
}
