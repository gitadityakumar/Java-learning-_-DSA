import java.util.Scanner;

public class L3q34 {
    public static void main(String[] args) {
        //Calculate Average Marks
        //Average = (Sum of Values) / (Number of Values)
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the number of marks: ");
        int numMarks = scanner.nextInt();

        int sum = 0;

        for (int i = 1; i <= numMarks; i++) {
            System.out.print("Enter mark " + i + ": ");
            int mark = scanner.nextInt();

            sum += mark;
        }
        double average = (double) sum / numMarks;

        System.out.println("Average Mark: " + average);

        scanner.close();
    }
}
