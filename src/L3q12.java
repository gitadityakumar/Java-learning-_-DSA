import java.util.Scanner;

public class L3q12 {
    public static void main(String[] args) {
        //Perimeter Of Square
        //Perimeter of square, (P) = 4 × Side
        Scanner input = new Scanner(System.in);
        int side = input.nextInt();
        int perimeter = 4* side;
        System.out.println(perimeter);
        input.close();
    }
}
