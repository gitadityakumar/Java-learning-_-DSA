import java.util.Scanner;

public class L3q32 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the number of courses: ");
        int numCourses = scanner.nextInt();

        double totalGradePoints = 0.0;
        int totalCreditHours = 0;

        for (int i = 1; i <= numCourses; i++) {
            System.out.println("Course " + i + ":");

            System.out.print("Enter the grade (A, A-, B+, B, B-, C+, C, C-, D+, D, F): ");
            String grade = scanner.next();

            System.out.print("Enter the credit hours for the course: ");
            int creditHours = scanner.nextInt();

            double gradePoint = calculateGradePoint(grade);

            totalGradePoints += gradePoint * creditHours;
            totalCreditHours += creditHours;
        }

        double cgpa = totalGradePoints / totalCreditHours;

        System.out.println("CGPA: " + cgpa);

        scanner.close();
    }

    public static double calculateGradePoint(String grade) {
        switch (grade) {
            case "A": return 4.0;
            case "A-": return 3.7;
            case "B+": return 3.3;
            case "B": return 3.0;
            case "B-": return 2.7;
            case "C+": return 2.3;
            case "C": return 2.0;
            case "C-": return 1.7;
            case "D+": return 1.3;
            case "D": return 1.0;
            case "F": return 0.0;
            default: return 0.0; // Handle invalid grades
        }
    }
}
