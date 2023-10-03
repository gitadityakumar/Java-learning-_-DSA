import java.util.Scanner;

//Intermediate Java Programs
public class L3q27 {
    public static void main(String[] args) {
        //Factorial Program In Java
        Scanner input = new Scanner(System.in);
        int N = input.nextInt();
        int factorial = 1;
        for(int i = N; i >= 1; i--){
            factorial = factorial*i;

        }
        System.out.println(factorial);
    }
}
