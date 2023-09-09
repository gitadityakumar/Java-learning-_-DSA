import java.util.Scanner;

public class L3q18 {
    public static void main(String[] args) {
        //Volume Of Pyramid
        //Volume of pyramid = (1/3) (Bh), where
        //
        //B = Area of the base of the pyramid
        //h = Height of the pyramid (which is also called "altitude")
        Scanner input = new Scanner(System.in);
        float B = input.nextInt();
        float h = input.nextInt();
        float v = (float) 1 / 3 * B * h;
        System.out.println(v);
        input.close();

    }
}
