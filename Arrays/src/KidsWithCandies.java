import java.util.ArrayList;
import java.util.List;

public class KidsWithCandies {
    public static List<Boolean> kidsWithCandies(int[] candies, int extraCandies) {
        ArrayList<Boolean> result = new ArrayList<>();

        // Find the maximum number of candies
        int maxCandies = Integer.MIN_VALUE;
        for (int candy : candies) {
            maxCandies = Math.max(maxCandies, candy);
        }

        // Check if each kid can have the greatest number of candies after adding extraCandies
        for (int candy : candies) {
            result.add(candy + extraCandies >= maxCandies);
        }

        return result;
    }

    public static void main(String[] args) {
        int[] candies1 = {2, 3, 5, 1, 3};
        int extraCandies1 = 3;
        System.out.println("Example 1: " + kidsWithCandies(candies1, extraCandies1));

        int[] candies2 = {4, 2, 1, 1, 2};
        int extraCandies2 = 1;
        System.out.println("Example 2: " + kidsWithCandies(candies2, extraCandies2));

        int[] candies3 = {12, 1, 12};
        int extraCandies3 = 10;
        System.out.println("Example 3: " + kidsWithCandies(candies3, extraCandies3));
    }
}
