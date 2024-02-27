import java.util.Scanner;

public class Patterns {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a integer number : ");
        int n = input.nextInt();
        /*
                triangularPainting(n);
                rightAnglePyramid2(n);
                rightangleP(n);
                squareP(n);
        */
//        invertedRightPyramid(n);
        invertedNumberedRightPyramid(n);



        input.close(); // for closing scanner .
    }
    static void squareP(int num){
        for (int i = 0; i < num; i++) {
            for (int j = 0; j < num; j++) {
                System.out.print("*");
            }
            System.out.println();

        }
    }
    static void rightangleP (int num ){
        for (int i = 0; i < num; i++) {
            for (int j = 0; j <= i; j++) {
                System.out.print("*");
            }
            System.out.println();

        }
    }

    static void triangularPainting(int num){
        for (int i = 1; i <= num; i++) {
            for (int j =1 ; j <= i ; j++) {
                System.out.print(j);
            }
            System.out.println();

        }
    }

    static void rightAnglePyramid2(int num) {
        for (int i = 1; i <= num; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print(i);
            }
            System.out.println();

        }
    }
    
    static void invertedRightPyramid(int num){
        for (int i = 0; i < num; i++) {
            for (int j = num; j > i; j--) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
    static void  invertedNumberedRightPyramid(int num){
        for (int i = 0; i < num; i++) {
            for (int j = num; j > i; j--) {
                System.out.print(num-j+1);

            }
            System.out.println();

        }
        
    }
}
