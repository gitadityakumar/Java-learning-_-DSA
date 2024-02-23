public class RemoveDuplicateFromSortedArray {
    public static void main(String[] args) {
        int[] sortedArr = {1, 1, 2, 2, 2, 3, 3};
        int[] result = removeDuplicates(sortedArr);
        for (int i = 0; i < result.length; i++) {
            System.out.print(result[i] + " ");
        }
    }

    public static int[] removeDuplicates(int[] input) {
        int n = input.length;
        if (n <= 1) {
            return input;
        }

        int uniqueElements = 1;
        for (int i = 0; i < n - 1; i++) {
            if (input[i] != input[i + 1]) {
                uniqueElements++;
            }
        }

        int[] result = new int[uniqueElements];
        result[0] = input[0];
        int j = 1;
        for (int i = 0; i < n - 1; i++) {
            if (input[i] != input[i + 1]) {
                result[j] = input[i + 1];
                j++;
            }
        }

        return result;
    }
}
