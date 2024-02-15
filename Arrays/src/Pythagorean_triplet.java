//Write a function to check if a given triplet is a Pythagorean triplet or not.
// (A Pythagorean triplet is when the sum of the square of two numbers is equal to the square of the third number).
//Question:
//Given an array of integers, write a function that returns true if there is a triplet (a, b, c) that satisfies a2 + b2 = c2.
//
//Example:
//
//Input: arr[] = {3, 1, 4, 6, 5}
//Output: True
//There is a Pythagorean triplet (3, 4, 5).
//
//Input: arr[] = {10, 4, 6, 12, 5}
//Output: False
//There is no Pythagorean triplet.
public class Pythagorean_triplet {
    public static void main(String[] args) {
        int[] arr = {3,1,4,6,5};
        System.out.println(isPtriplet(arr));
    }
    static boolean isPtriplet(int[] input){
        for (int i = 0; i < input.length; i++) {
            for (int j = i+1; j < input.length  ; j++) {
                for (int k = j+1; k < input.length; k++) {
                    int x = input[i] * input[i], y = input[j] * input[j], z = input[k] * input[k];
                    if(x==y+z || y==x+z || z==x+y){
                        return true;
                    }

                }

            }

        }
        return false;
    }
}
