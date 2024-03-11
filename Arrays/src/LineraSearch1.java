//find out whether 14 exist in array or not
// arr = {18,546,567,4,3,4,14,6,4,34}
public class LineraSearch1 {
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
