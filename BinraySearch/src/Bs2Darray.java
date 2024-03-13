import java.util.Arrays;
public class Bs2Darray {
    public static void main(String[] args) {
        //in this question we know that matrix(2D array) is sorted
        int [][] arr = {
                {10,20,30,40},
                {15,25,35,45},
                {28,29,37,49},
                {33,34,38,50}
        };
        System.out.println(Arrays.toString(search(arr,28)));

    }
    static int [] search(int [][] matrix,int target){
        int r = 0;
        int c = matrix.length -1;

        while(r< matrix.length && c >=0){
            if(matrix[r][c]==target) return new int[]{r,c};

            if(matrix[r][c] < target){
                r++;
            }else{
                c--;
            }
        }
        return new int[]{-1,-1};
    }
}
