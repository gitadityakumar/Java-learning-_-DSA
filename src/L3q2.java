import java.util.Scanner;

public class L3q2 {
    public static void main(String[] args) {
        //Area Of Triangle
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the base of triangle:");
        float base = input.nextFloat();
        System.out.println("Enter the height of triangle:");
        float height = input.nextFloat();
        float area = (float) (0.5*base*height);
        System.out.println("Area of triangle is"+ " "+ area);
    }
}
