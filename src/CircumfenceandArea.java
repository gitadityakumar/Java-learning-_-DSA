import java.util.Scanner;

public class CircumfenceandArea {
//    Write a program to print the circumference and area of a circle of radius entered by user by defining your own method.
public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
    int r = input.nextInt() ;
    System.out.println("the circumference of circle is "+Circumference(r));
    System.out.println("the area of circle is "+ Area(r));
}
static double Circumference(int r ){
    return 2*Math.PI*r;
}
static double Area(int r){
    return Math.PI*r*r;
}
}
