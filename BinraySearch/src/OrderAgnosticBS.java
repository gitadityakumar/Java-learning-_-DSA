public class OrderAgnosticBS {
    public static void main(String[] args) {
//        int[] arr = {-118, -12, -4, 0, 2, 3, 4, 15, 18, 22, 45, 89};
        int [] arr = {99,80,75,22,11,10,5,2,-3};
        int target = 22;
        int ans = orderAgnosticBs(arr,target);
        System.out.println("element found at index of : " + ans);

    }
    //method for searching
    //will return the element of index
    static int orderAgnosticBs(int []arr,int target){
        int start = 0;
        int end = arr.length - 1;
        //find whether array is of ascending or descending
        boolean isAsc = arr[start] < arr[end];


        while (start <= end) {
            int mid = start + (end - start) / 2;
            //common for both ascending and descending order problems
            if(arr[mid]==target) return mid;

            if(isAsc){
                if(target < arr[mid]){
                    end = mid -1 ;
                }else{
                    start = mid + 1;
                }
            }else{
                if(target > arr[mid]){
                    end = mid -1 ;
                }else{
                    start = mid + 1;
                }
            }
        }
        return -1;

    }
}
