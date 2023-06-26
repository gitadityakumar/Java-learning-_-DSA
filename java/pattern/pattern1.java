// *****
// *****
// *****
// *****             print this pattern 

public class pattern1 {
    /**
     * @param args
     */
    public static void main(String[] args) {
        int n = 4;
        int m = 5;

        // outer loop --> it defines the number of row in a pattern
        for (int i = 1; i <= 4; i++) {

            // inner loop --> it defines the number of coulmns in a pattern
            for (int j = 1; j <= 5; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
