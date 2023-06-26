//floyid's triangle 
// 1 
// 2 3
// 4 5 6
// 7 8 9 10
// 11 12 13 14 15

public class pattern8 {
    public static void main(String[] args) {
        int n = 5;
        int number = 1; // taking a external counter
        // outerloop
        for (int i = 1; i <= n; i++) {
            // inner loop
            for (int j = 1; j <= i; j++) {
                System.out.print(number + " ");
                number++;
            }
            System.out.println();
        }
    }
}
