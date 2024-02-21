import java.util.Arrays;
//Leetcode problem 1740

public class ShuffleArray {
    public int[] shuffle(int[] nums, int n) {
        int[] result = new int[2 * n];

        for (int i = 0; i < n; i++) {
            result[2 * i] = nums[i]; // Fill even indices with elements from the first half
            result[2 * i + 1] = nums[i + n]; // Fill odd indices with elements from the second half
        }

        return result;
    }

    public static void main(String[] args) {
        ShuffleArray solution = new ShuffleArray();

        int[] nums1 = {2, 5, 1, 3, 4, 7};
        int n1 = 3;
        int[] result1 = solution.shuffle(nums1, n1);
        System.out.println("Example 1: " + Arrays.toString(result1));

        int[] nums2 = {1, 2, 3, 4, 4, 3, 2, 1};
        int n2 = 4;
        int[] result2 = solution.shuffle(nums2, n2);
        System.out.println("Example 2: " + Arrays.toString(result2));

        int[] nums3 = {1, 1, 2, 2};
        int n3 = 2;
        int[] result3 = solution.shuffle(nums3, n3);
        System.out.println("Example 3: " + Arrays.toString(result3));
    }
}

