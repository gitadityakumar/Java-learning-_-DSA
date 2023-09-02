import java.util.Scanner;

public class sum {
    public static void main(String[] args) {
        System.out.println(Sum()); //calling a function and printing it simultaneously

    }
    // return type of function is int
    static int Sum(){
        Scanner in = new Scanner(System.in);
        int a = in.nextInt();
        int b = in.nextInt();
        return a+b;  //function ends here
    }
}
