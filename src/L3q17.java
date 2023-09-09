import java.util.Scanner;

public class L3q17 {
    public static void main(String[] args) {
        //Volume Of Sphere
        //Volume of Solid Sphere
        //If the radius of the sphere formed is r and the volume of the sphere is V. Then, the volume of the sphere is given by:
        //Volume of Sphere, V = (4/3)πr3
        Scanner input = new Scanner(System.in);
        float r = input.nextFloat();
        float v = (float) ((4/3)*(Math.PI)*r*r*r);
        System.out.println(v);
        input.close();

    }
}
