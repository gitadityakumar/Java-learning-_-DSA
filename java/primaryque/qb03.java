import java.util.Scanner;

//Write a program to input principal, time, and rate (P, T, R) from the user and find Simple Interest.
//Simple interest is calculated with the following formula: S.I. = (P × R × T)/100
//        where P = Principal, R = Rate of Interest in % per annum, and T = Time, usually calculated as the number
//        of years. The rate of interest is in percentage R% (and is to be written as R/100, thus 100 in the formula). To understand more about this formula, click here.
public class qb03 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int P = input.nextInt();
        int T = input.nextInt();
        int R = input.nextInt();
        int SimpleInterest = (P*R*T)/100;
        System.out.println("Simple Interest is: "+ SimpleInterest );
    }
}
