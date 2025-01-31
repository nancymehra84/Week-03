package hash_maps_and_hash_functions.sum_in_array;

import java.util.*;

public class PairWithGivenSum {
    // Function to check if a pair with the given sum exists
    public static boolean hasPairWithSum(int[] nums, int target) {
        Set<Integer> seen = new HashSet<>();

        for (int num : nums) {
            int complement = target - num;

            // If complement exists in the set, return true
            if (seen.contains(complement)) {
                return true;
            }

            // Otherwise, add the current number to the set
            seen.add(num);
        }

        return false; // No pair found
    }

    public static void main(String[] args) {
        int[] nums = {10,5,8,12};
        int target = 18;

        if (hasPairWithSum(nums, target)) {
            System.out.println("Pair with given sum exists.");
        } else {
            System.out.println("No pair with the given sum exists.");
        }
    }
}

