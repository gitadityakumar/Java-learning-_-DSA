public class GoodPairs {
    public static int numIdenticalPairs(int[] nums) {
        int[] count = new int[101]; // Count array to store the frequency of each number (since 1 <= nums[i] <= 100)
        int goodPairs = 0;

        // Iterate through the array and count the frequency of each number
        for (int num : nums) {
            count[num]++;
        }

        // Iterate through the count array and calculate the number of good pairs for each number
        for (int freq : count) {
            // Calculate the number of good pairs that can be formed using freq occurrences of a number
            goodPairs += (freq * (freq - 1)) / 2;
        }

        return goodPairs;
    }

    public static void main(String[] args) {
        int[] nums1 = {1, 2, 3, 1, 1, 3};
        System.out.println("Example 1: " + numIdenticalPairs(nums1));

        int[] nums2 = {1, 1, 1, 1};
        System.out.println("Example 2: " + numIdenticalPairs(nums2));

        int[] nums3 = {1, 2, 3};
        System.out.println("Example 3: " + numIdenticalPairs(nums3));
    }
}
