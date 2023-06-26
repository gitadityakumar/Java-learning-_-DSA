public class array2D {
    public static void main(String[] args) {
        // defining a 2d array
        int matrix[][] = { { 1, 3, 4 }, { 1, 5, 5 }, { 3, 5, 7 } };

        // displaying the elements of 2d array
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }
    }
}
