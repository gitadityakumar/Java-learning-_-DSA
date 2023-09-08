import java.util.Scanner;

public class L3q15 {
    public static void main(String[] args) {
        //Volume Of Prism
        //	Volume of triangular prism = Area of triangle × height of the prism
        Scanner in = new Scanner(System.in);
        float AreaOfTriangle = in.nextFloat();
        float heightOfThePrism = in.nextFloat();
        float VolumeOfTriangularPrism = AreaOfTriangle*heightOfThePrism;
        System.out.println(VolumeOfTriangularPrism);
        in.close();
    }
}
