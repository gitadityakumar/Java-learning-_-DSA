import java.util.Scanner;

import static java.lang.Math.log10;

public class CountNumbrs {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int number = input.nextInt();
        System.out.println(contnumber(number));
    }
    static int contnumber(int a){
        return (int) Math.floor(Math.log10(a) + 1);
    }
}
