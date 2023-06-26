import java.util.Scanner;

public class usserinputarray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("please enter your array length:");
        int size = sc.nextInt();
        int numbers[] = new int[size];
        // looping here so that every number given by user can be add in array
        for (int i = 0; i < size; i++) {
            numbers[i] = sc.nextInt();

        }
        // a for loop for printing array elements
        for (int i : numbers) {
            System.out.print(i + " ");

        }
    }
}
