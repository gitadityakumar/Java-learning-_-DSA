import java.util.Scanner;

public class L3q1 {
    public static void main(String[] args) {
        //Area Of Circle Java Program
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the radius of circle:");
        float radius = input.nextFloat();
        float area = (float) (Math.PI * Math.pow(radius,2));
        System.out.println("Area of circle is"+ " "+ area);
    }
}
