public class L3q22 {
    public static void main(String[] args) {
        Solution solution = new Solution(); // Create an instance of the Solution class

        // Test your method with specific input values
        int result1 = solution.subtractProductAndSum(234);
        int result2 = solution.subtractProductAndSum(4421);
        int result3 = solution.subtractProductAndSum(12345);

        // Print the results
        System.out.println("Result 1: " + result1);
        System.out.println("Result 2: " + result2);
        System.out.println("Result 3: " + result3);
    }
}

class Solution {
    public int subtractProductAndSum(int n) {
        int product = 1;
        int sum = 0;

        while (n > 0) {
            int digit = n % 10;
            product *= digit;
            sum += digit;
            n /= 10; //Here, n is divided by 10 to remove the last digit and prepare for the next iteration.
        }

        return product - sum;
    }
}
