import java.util.Arrays;
import java.util.Scanner;

public class Test2 {
    public static void main(String[] args) {
        //lets take input in a array
        Scanner input = new Scanner(System.in);
        //defining the size of array
        int [] arr = new int[5];
//        Looping it for taking input
        for (int i = 0; i < arr.length; i++) {
            arr[i] = input.nextInt();
        }
      // printing out Array with Arrays.toString() method
        System.out.println(Arrays.toString(arr));


    }
}
