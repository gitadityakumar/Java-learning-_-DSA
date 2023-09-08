import java.util.Scanner;

public class L3q11 {
    public static void main(String[] args) {
        //Perimeter Of Rectangle
        //Perimeter of a rectangle = 2(l + w)
        Scanner input = new Scanner(System.in);
        int l = input.nextInt();
        int w = input.nextInt();
        int perimeter = 2*(l+w);
        System.out.println(perimeter);
        input.close();
    }
}
