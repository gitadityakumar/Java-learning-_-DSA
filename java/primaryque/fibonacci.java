//To calculate Fibonacci Series up to n numbers.
//The Rule is xn = xn−1 + xn−2
//where:
//
//        xn is term number "n"
//        xn−1 is the previous term (n−1)
//        xn−2 is the term before that (n−2)To calculate Fibonacci

import java.util.Scanner;

public class fibonacci {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();
        int a1 = 0;
        int a2 = 1;
        for (int i = 0; i < n; i++){
            System.out.println(a1);
            int next = a1 + a2;
            a1=a2;
            a2=next;

        }
        
    }
}
