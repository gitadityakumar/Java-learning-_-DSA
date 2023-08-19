import java.util.Scanner;

//Input currency in rupees and output in USD.
public class qb05 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double Rupee = input.nextInt();
        double usd = (Rupee*0.012027);
        System.out.println(Rupee + " RUPEE" + " is equal to  " + usd +" USD");

    }
}
