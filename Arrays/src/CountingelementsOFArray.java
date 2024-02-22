public class CountingelementsOFArray {
    public static void main(String[] args) {
        int[] nums = {8, 1, 2, 2, 3};
        int[] count = new int[101]; // Initialize count array with 101 elements (0 to 100)

// Loop through each element in nums and count occurrences
        for (int num : nums) {
            count[num]++; // Increment the count at the index corresponding to the current element
        }

// Print the counts for each number
        for (int i = 0; i < count.length; i++) {
            if (count[i] > 0) {
                System.out.println("Number " + i + " occurs " + count[i] + " times.");
            }
        }

    }
}
