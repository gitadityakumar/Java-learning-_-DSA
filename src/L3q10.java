import java.util.Scanner;

public class L3q10 {
    public static void main(String[] args) {
        //perimeter Of Parallelogram
// Here are the formulas to find the perimeter of a parallelogram in each of these cases:
// P = 2 (a + b), where a, b are the adjacent sides of a parallelogram
// P = 2a + √(2x2 + 2y2 - 4a2), where a is the a side of the parallelogram, and x, y are its diagonals.
// P = 2a + 2h / sinθ, where a is the side of the parallelogram, h is the height and θ is the angle of the parallelogram.
        Scanner input = new Scanner(System.in);
        int a = input.nextInt();
        int b = input.nextInt();
        int p = 2*(a+b);
        System.out.println(p);
        input.close();
    }

}
