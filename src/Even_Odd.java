import java.util.Scanner;

public class Even_Odd {
    //    Define a program to find out whether a given number is even or odd.
    public static void main(String[] args) {
        //some code for main function
        Scanner input = new Scanner(System.in);
        int a = input.nextInt();
        input.close();
        if(EvenOdd(a)){
            System.out.println("number is even");
        }else{
            System.out.println("number is odd");
        }
    }

    //function for checking odd or even
   static  boolean EvenOdd(int a){
       return a % 2 == 0;

   }




}
