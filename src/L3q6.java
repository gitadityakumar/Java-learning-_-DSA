import java.util.Scanner;

public class L3q6 {
    public static void main(String[] args) {
        //Area Of Rhombus
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the first dimension of rhombus ");
        int d1 = input.nextInt();
        System.out.print("Enter the second dimension of rhombus ");
        int d2 = input.nextInt();
        int Area = (d1*d2)/2;
        System.out.println("Area of rhombus is "+Area);
    }
}
