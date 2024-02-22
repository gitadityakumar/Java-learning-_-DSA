import java.util.Arrays;

public class SmallerNumbers {

    public static int[] smallerNumbersThanCurrent(int[] nums) {
        int[] count = new int[101]; // Since the constraint says 0 <= nums[i] <= 100
        int[] result = new int[nums.length];

        // Count occurrences of each number
        for (int num : nums) {
            count[num]++;
        }

        // Calculate how many numbers are smaller than current number
        for (int i = 0; i < nums.length; i++) {
            int smallerCount = 0;
            for (int j = 0; j < nums[i]; j++) {
                smallerCount += count[j];
            }
            result[i] = smallerCount;
        }

        return result;
    }

    public static void main(String[] args) {
        int[] nums1 = {8, 1, 2, 2, 3};
        int[] nums2 = {6, 5, 4, 8};
        int[] nums3 = {7, 7, 7, 7};

        int[] result1 = smallerNumbersThanCurrent(nums1);
        int[] result2 = smallerNumbersThanCurrent(nums2);
        int[] result3 = smallerNumbersThanCurrent(nums3);

        System.out.println("Output for nums1: " + Arrays.toString(result1));
        System.out.println("Output for nums2: " + Arrays.toString(result2));
        System.out.println("Output for nums3: " + Arrays.toString(result3));
    }
}
