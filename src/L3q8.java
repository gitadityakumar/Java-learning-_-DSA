import java.util.Scanner;

public class L3q8 {
    public static void main(String[] args) {
        //Perimeter Of Circle
        Scanner input = new Scanner(System.in);
        double r = input.nextDouble();
        double perimeter = 2*r*Math.PI;
        System.out.println(perimeter);
        input.close();
    }
}
