import java.util.Scanner;

public class calculator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("this is a basic calculator that can perform operation on two number");
        System.out.println("Enter your first number");
        int x = sc.nextInt();
        System.out.println("Enter your second number");
        int y = sc.nextInt();
        System.out.println("please choose the operation");
        System.out.println("1 : + (Addition) a + b");
        System.out.println("2 : - (Subtraction) a - b");
        System.out.println("3 : * (Multiplication) a * b");
        System.out.println("4 : / (Division) a / b");
        System.out.println("5 : % (Modulo or remainder) a % b");
        int choose = sc.nextInt();
        switch (choose) {
            case 1:
                System.out.println(x + y);
                break;
            case 2:
                System.out.println(x - y);
                break;
            case 3:
                System.out.println(x * y);
                break;
            case 4:
                System.out.println(x / y);
                break;
            case 5:
                System.out.println(x % y);
                break;
            default:
                System.out.println("please choose correct option ");

        }

    }
}
