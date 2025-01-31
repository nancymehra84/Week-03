package hash_maps_and_hash_functions.two_sum_problem;

import java.util.HashMap;

public class TwoSumProblem {
    // Function to find the indices of the two elements
    public static int[] twoSum(int[] nums, int target) {
        // Create a hash map
        HashMap<Integer, Integer> map = new HashMap<>();

        for (int i = 0; i < nums.length; i++) {
            int complement = target - nums[i];

            // Check if the complement exists
            if (map.containsKey(complement)) {

                return new int[] { map.get(complement), i };
            }

            map.put(nums[i], i);
        }

        return null;
    }

    public static void main(String[] args) {
        int[] nums = {2, 7, 11, 15};
        int target = 9;

        // Find the result
        int[] result = twoSum(nums, target);

        if (result != null) {
            System.out.println("Indices of the two elements: [" + result[0] + ", " + result[1] + "]");
        } else {
            System.out.println("No solution found.");
        }
    }
}

