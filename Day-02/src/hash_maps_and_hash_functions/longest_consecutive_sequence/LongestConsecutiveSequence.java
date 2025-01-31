package hash_maps_and_hash_functions.longest_consecutive_sequence;

import java.util.*;

public class LongestConsecutiveSequence {
    public static int longestConsecutive(int[] nums) {
        if (nums.length == 0) return 0;

        Set<Integer> set = new HashSet<>();
        for (int num : nums) {
            set.add(num);  // Add each number to the set
        }

        int maxLength = 0;

        for (int num : set) {
            // If the current number is the beginning of a sequence
            if (!set.contains(num - 1)) {
                int currentNum = num;
                int currentLength = 1;

                // Count the length of the consecutive sequence starting with 'num'
                while (set.contains(currentNum + 1)) {
                    currentNum++;
                    currentLength++;
                }

                // Update the maximum length
                maxLength = Math.max(maxLength, currentLength);
            }
        }

        return maxLength;
    }

    public static void main(String[] args) {
        int[] nums = {100, 4, 200, 1, 3, 2};
        System.out.println("Length of the longest consecutive sequence: " + longestConsecutive(nums));
    }
}

