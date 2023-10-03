import java.util.Scanner;

public class L3q24 {
    public static void main(String[] args) {
        //Take integer inputs till the user enters 0 and print the sum of all numbers (HINT: while loop)
        Scanner input = new Scanner(System.in);
        System.out.println("enter the number and if u want to know sum just give me zero(0)");
        int integer = input.nextInt();
        int sum = 0;
        while(true){
            integer = input.nextInt();

            if(integer==0){
                break;
            }
            sum +=integer;
        }
        System.out.println("your sum of entered number are "+sum);
        input.close();
    }
}
