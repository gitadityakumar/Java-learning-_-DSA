public class LinearSearch {
    public static void main(String[] args) {
        int []  arr = {1,3,46,8,65,453,32,534,5,53,3,4};
        System.out.println("number is present :"+ linearSearch(arr));
    }
    static  boolean  linearSearch(int [] array){
        for (int i = 0; i < array.length; i++) {
            if(array[i]==32) {
                return true;
            }

        }
        return false;
    }
}
