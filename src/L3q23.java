import java.util.Scanner;

public class L3q23 {
    public static void main(String[] args) {
        //Input a number and print all the factors of that number (use loops).
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();

        int i = 2;
        System.out.println(1);
        while (i<=n){
            if(n%i==0){
                System.out.println(i);

            }
            i++;
        }
        input.close();

    }
}
