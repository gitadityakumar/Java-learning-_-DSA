import java.util.Scanner;

public class L3q4 {
    public static void main(String[] args) {
        //Area Of Isosceles Triangle
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the common side of isosceles triangle: ");
        float a = input.nextFloat();
        System.out.print("Enter the base of isosceles triangle : ");
        float b = input.nextFloat();
        float area = (float) ((float) .5 * b * (Math.sqrt((a*a)-(b/2*b/2))));
        System.out.println("Area of Isosceles triangle : "+area);
    }
}
