//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {

        public static void main(String[] args) {
            int [] array = {18,546,567,4,3,4,14,6,4,34};
            int target = 14;
            boolean ans = linearSearch(array,  target);
            System.out.println("the presence of target in array is : " +ans);
        }
        static boolean linearSearch(int [] arr, int target){
            if(arr.length == 0){
                return false;
            }
            for (int i = 0; i < arr.length; i++) {
                if(arr[i]==target){
                    return true;
                }

            }
            return false;
        }

}