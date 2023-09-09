import java.util.Scanner;

public class L3q16 {
    public static void main(String[] args) {
        //Volume Of Cylinder
 /*
Using this formula, the formulas of volume of cylinder are:
The formula for volume of a right circular cylinder is, V = πr2h (r = radius, h = height)
The formula for volume of an oblique cylinder is, V = πr2h (r = radius, h = height)
The formula for volume of an elliptic cylinder is, V = πabh (a and b = radii, h = height)
The formula for volume of a right circular hollow cylinder is, V = π(R2 - r2)h (R = outer radius, r = inner radius, h = height)
*/
        Scanner input = new Scanner(System.in);
        float r = input.nextFloat();
        float h = input.nextFloat();
        float V = (float) (Math.PI)*r*2*h;
        System.out.println(V);
        input.close();


    }
}
