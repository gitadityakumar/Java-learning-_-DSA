import java.util.Scanner;

public class Productof2 {
//    Define a method that returns the product of two numbers entered by user.
public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
    int a = input.nextInt();
    int b = input.nextInt();
    System.out.println("the product of two numbers is "+ productOfTwo(a,b));

}
static int productOfTwo(int a,int b){
    return a*b;
}
}
