import java.util.Scanner;

public class L3q7 {
    public static void main(String[] args) {
        //Area Of Equilateral Triangle
        //Area = √3/4 × (side)2
        Scanner input = new Scanner(System.in);
        double side = input.nextDouble();
        double area = (side * side * Math.sqrt(3)) / 4;
        System.out.println(area);
        input.close(); //closes the input stream that reduces the risk of resource leakage in big programs
    }
}
