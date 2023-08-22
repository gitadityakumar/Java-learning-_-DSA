import java.util.Scanner;

public class Dowhile {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();
        int c = 1;
        do{
            System.out.println(c);
            c++;
        }while(c<=n);
    }
}
