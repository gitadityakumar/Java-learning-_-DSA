import java.util.Arrays;

public class test {
    public static void main(String[] args) {
       int [] numbers = {1,4,5,6,7,45,3,};
       numbers[1] = 15;
//        for (int i = 0; i < numbers.length; i++) {
//            System.out.print(numbers[i]+ " ");
//
//        }
        System.out.println(numbers[1]);;
        System.out.println(numbers.length);
        for(int i:numbers){
            System.out.println(i);
        }
//        The example above can be read like this: for each String element (called i - as in index) in cars,
//        print out the value of i.
    }
}
