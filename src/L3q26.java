import java.util.Scanner;

public class L3q26 {
    public static void main(String[] args) {
        //Addition Of Two Numbers
        Scanner in = new Scanner(System.in);
        System.out.println("enter first number");
        int a = in.nextInt();
        System.out.println("enter second number");
        int b = in.nextInt();
        int sum = a+b;
        System.out.println("the sum of two number is : "+sum);
        in.close();
    }
}
