import java.util.Scanner;

public class L3q5 {
    public static void main(String[] args) {
        // Area of Parallelogram
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the length of base: ");
        int base = input.nextInt();
        System.out.println("Enter the length of height: ");
        int height = input.nextInt();
        int Area = base*height;
        System.out.println("The area of the parallelogram is : "+Area);
    }
}
