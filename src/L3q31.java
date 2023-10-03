import java.util.Scanner;

public class L3q31 {
    public static void main(String[] args) {
        //Calculate Distance Between Two Points
        /*Distance between two points in coordinate geometry is calculated
         by the formula √[(x2 − x1)2 + (y2 − y1)2], where (x1, y1) and (x2, y2) are
         two points on the coordinate plane. Let us understand the formula to find the
          distance between two points in a two-dimensional and three-dimensional plane.*/
        Scanner input = new Scanner(System.in);
        double x1 = input.nextDouble();
        double x2 = input.nextDouble();
        double y1 = input.nextDouble();
        double y2 = input.nextDouble();
        input.close();
        double xcor = x2-x1;
        double ycor = y2-y1;
        double distance = Math.sqrt(Math.pow(xcor,2) + Math.pow(ycor,2));
        System.out.println(distance);
    }
}
