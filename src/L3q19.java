import java.util.Scanner;

public class L3q19 {
    public static void main(String[] args) {
        //Curved Surface Area Of Cylinder
        //Curved surface of cylinder (or) CSA of cylinder = 2πrh
        Scanner input  = new Scanner(System.in);
        float r = input.nextFloat();
        float h = input.nextFloat();
        float A = (float) ((2*Math.PI)*r*h);
        System.out.println(A);
        input.close();
    }
}
