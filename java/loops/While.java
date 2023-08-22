import java.util.Scanner;

public class While {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();
        int N = 1;
        while(N<=n){
            System.out.println(N);
            N +=1;
        }

    }
}
