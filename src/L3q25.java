import java.util.Scanner;
//the logic is => maan lo ki sabse chota number hi sabse bada hai phir loop chalao aur check karo jo tumne maana
//hai wo sahi hai ya nhi

public class L3q25 {
    public static void main(String[] args) {
        //Take integer inputs till the user enters 0 and print the largest number from all.
        Scanner input = new Scanner(System.in);
        System.out.println("enter the number and if you want to know largest just enter 0");
        int n = input.nextInt();
        int largestNumber = Integer.MIN_VALUE;
        while(true){
            n=input.nextInt();
            if(n==0){
                break;
            }
            if(n>largestNumber){
                largestNumber=n;
            }
        }
        input.close();
        if (largestNumber != Integer.MIN_VALUE) {
            System.out.println("The largest number entered is: " + largestNumber);
        } else {
            System.out.println("No valid numbers were entered.");
        }

    }
}
