import java.util.Scanner;

public class Factorial {
//    Write a program to print the factorial of a number by defining a method named 'Factorial'
public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
    double n = input.nextDouble();
    input.close();
    System.out.println("the factorial of given number is "+ Factorial(n));
}
static int Factorial(double n ){
    if(n==1){
        System.out.println("enter value greater than 1");
    }
    double fact = 1;
    for (double f = n; f > 1; f--) {

       fact = fact*f;

    }
    return (int)fact;
}
}
