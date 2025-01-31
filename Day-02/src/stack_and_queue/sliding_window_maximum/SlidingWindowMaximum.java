package stack_and_queue.sliding_window_maximum;

import java.util.*;

public class SlidingWindowMaximum {
    public static int[] maxSlidingWindow(int[] nums, int k) {
        if (nums == null || k <= 0) return new int[0];

        int n = nums.length;
        int[] result = new int[n - k + 1]; // Result array
        Deque<Integer> deque = new LinkedList<>(); // Store indices

        for (int i = 0; i < n; i++) {
            // Remove elements out of current window
            while (!deque.isEmpty() && deque.peekFirst() < i - k + 1) {
                deque.pollFirst();
            }

            // Remove elements from back that are smaller than current element
            while (!deque.isEmpty() && nums[deque.peekLast()] <= nums[i]) {
                deque.pollLast();
            }

            // Add current element index
            deque.offerLast(i);

            // Store result when we have a valid window
            if (i >= k - 1) {
                result[i - k + 1] = nums[deque.peekFirst()];
            }
        }

        return result;
    }

    public static void main(String[] args) {
        int[] nums = {2,-4,3,4,-3,-4,8,6};
        int k = 3;
        int[] result = maxSlidingWindow(nums, k);

        System.out.println("Sliding Window Maximums: " + Arrays.toString(result));
    }
}

