//Take name as input and print a greeting message for that particular name.

import java.util.Scanner;

public class qb02 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String Name = input.nextLine();
        System.out.println("Welcome,"+ Name);
    }
}
