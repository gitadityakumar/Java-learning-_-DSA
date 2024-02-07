import java.util.Scanner;

public class CheckPrime {
//    Define a method to find out if a number is prime or not.
public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
    int n = input.nextInt();
    if(checkprime(n)){
        System.out.println("this is a prime number");
    }else{
        System.out.println("this is not a prime number");
    }
}
static boolean checkprime(int n){
    if(n == 1){
        return false;
    }
    for (int i = 2; i < Math.sqrt(n); i++) {
        if(n%2==0){
            return false;
        }

    }
    return true;
}
}
