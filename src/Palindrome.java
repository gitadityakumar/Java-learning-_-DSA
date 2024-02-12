import java.util.Scanner;

public class Palindrome {
//    Write a function to find if a number is a palindrome or not. Take number as parameter.
public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
    int a = input.nextInt();
    input.close();
    if(isPalindrome(a)){
        System.out.println("this is a palindrome number");
    }else{
        System.out.println("Not a palindrome Number");
    }
}
static boolean isPalindrome(int n){
    int originalNumber = n;
    int reversedNumber = 0;

    while (n != 0) {
        int digit = n % 10;
        reversedNumber = reversedNumber * 10 + digit;
        n /= 10;
    }
    return originalNumber == reversedNumber;


}
}
