import java.util.Arrays;
public class changeValue {
    public static void main(String[] args) {
        //array
        int[] arr = {1,3,4,5,6,4};
        change(arr);
        System.out.println(Arrays.toString(arr));
    }
    static void change(int[] nums){
        nums[0] = 99;
    }
}
