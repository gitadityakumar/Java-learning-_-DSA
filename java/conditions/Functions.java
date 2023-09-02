import java.util.Scanner;

public class Functions {
    public static void main(String[] args) {
       sum();
    }

    static  void sum(){
        Scanner in = new Scanner(System.in);
        int a = in.nextInt();
        int b = in.nextInt();
        int sum = a + b;
        System.out.println(sum);
    }
}
