import java.util.Scanner;

public class Sumoftwonum {
//    Write a program to print the sum of two numbers entered by user by defining your own method.
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int a = input.nextInt();
        int b = input.nextInt();
        System.out.println("the sum of two numbers is "+ sumOfTwo(a,b));

    }
    static int sumOfTwo(int a,int b){
        return a+b;
    }
}
