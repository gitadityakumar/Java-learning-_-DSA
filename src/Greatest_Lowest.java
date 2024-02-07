//import java.util.Scanner;
//
////Define two methods to print the maximum and the minimum number respectively among three numbers entered by the user.
//
//public class Greatest_Lowest {
//    public static void main(String[] args) {
//        Scanner input = new Scanner(System.in);
//        int a = input.nextInt();
//        int b = input.nextInt();
//        int c = input.nextInt();
//        System.out.println("the maximun number is : ");
//        System.out.println(checkMaximum(a,b,c));
//        System.out.println("the minimum number is : ");
//        System.out.println(checkMinimum(a,b,c));
//    }
//
//    static int checkMaximum(int a,int b, int c ){
//        int maximum = a;
//        if(a>b){
//            System.out.println(maximum);
//        } else if (b>c) {
//            maximum = b;
//        }else{
//            maximum = c;
//        }
//        return  maximum;
//    }
//    static int checkMinimum(int a,int b, int c ){
//        int Minimum = a;
//        if(a<b){
//           return Minimum;
//        } else if (b<c) {
//            Minimum = b;
//        }else{
//            Minimum = c;
//        }
//        return  Minimum;
//    }
//}

import java.util.Scanner;

public class Greatest_Lowest {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int a = input.nextInt();
        int b = input.nextInt();
        int c = input.nextInt();

        // Printing maximum and minimum values
        System.out.println("the maximum number is : " + checkMaximum(a, b, c));
        System.out.println("the minimum number is : " + checkMinimum(a, b, c));
    }

    static int checkMaximum(int a, int b, int c) {
        if (a >= b && a >= c) {
            return a;
        } else if (b >= a && b >= c) {
            return b;
        } else {
            return c;
        }
    }

    static int checkMinimum(int a, int b, int c) {
        if (a <= b && a <= c) {
            return a;
        } else if (b <= a && b <= c) {
            return b;
        } else {
            return c;
        }
    }
}
