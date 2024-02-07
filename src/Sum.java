import java.util.Scanner;

public class Sum {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int a = input.nextInt();
        int b = input.nextInt();
        int result = sum(a,b);
        input.close();
        System.out.println(result);

    }

    public static int sum(int a , int b){
        return a+b;
    }
}
