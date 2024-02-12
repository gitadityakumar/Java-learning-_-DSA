import java.util.Scanner;

//Write a function that returns all prime numbers between two given numbers.
public class SumOfnNaturalNumbers {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();
        System.out.println(sumOfNatural(n));

    }
    static int sumOfNatural(int a){
        int sum = 0;
        for (int i = 1; i <= a; i++) {
            sum = sum+i;

        }
        return sum;
    }



}
