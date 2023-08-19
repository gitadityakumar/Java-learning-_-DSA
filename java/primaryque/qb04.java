import java.util.Scanner;

//Take 2 numbers as input and print the largest number
public class qb04 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int a = input.nextInt();
        int b = input.nextInt();

        if (a > b) {
            System.out.println("first input number a is Largest");
        } else {
            System.out.println("second number b is Largest");
        }

    }
}
