import java.util.Scanner;

public class checkforprime {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter your number to check : ");
        int num = input.nextInt();
        System.out.println(isprime(num));

    }
    static boolean isprime(int n){
        if(n<=1){
            return false;
        }else{
            for(int i = 2; i<Math.sqrt(n); i++){
                if(n%i==0){
                    return false;
                }
            }
            return true;
        }
    }
}
