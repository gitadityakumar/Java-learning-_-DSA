import java.util.Scanner;

public class userinput {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter your string here:"); // showing user to enter the text
        String obj = sc.next(); // taking input from user
        System.out.println(obj); // printing the user text in terminal

    }
}
