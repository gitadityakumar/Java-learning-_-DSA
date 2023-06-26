import java.util.Scanner;

public class if_else {
    public static void main(String[] args) {
        // a program to check user is minor or adult
        Scanner sc = new Scanner(System.in);
        System.out.println("To check your age please enter your age");
        int age = sc.nextInt();

        if (age >= 18) {
            System.out.println("congratulation you are an Adult ");
        } else {
            System.out.println("ohh you are a minor");
        }

    }
}
