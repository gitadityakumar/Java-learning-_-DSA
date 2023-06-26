
import java.util.Scanner;

public class printMyName {
    public static void printMyName(String name) {
        System.out.println("your good name is :" + name);
        return;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("please enter your first name :");
        String name = sc.next();
        printMyName(name);
    }
}
