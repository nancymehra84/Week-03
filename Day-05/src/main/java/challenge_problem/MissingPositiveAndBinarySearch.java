package challenge_problem;

import java.util.Arrays;

public class MissingPositiveAndBinarySearch {


    public static int findFirstMissingPositive(int[] nums) {
        int n = nums.length;

        //Place each number in its correct index
        for (int i = 0; i < n; i++) {
            while (nums[i] > 0 && nums[i] <= n && nums[nums[i] - 1] != nums[i]) {

                int temp = nums[i];
                nums[i] = nums[temp - 1];
                nums[temp - 1] = temp;
            }
        }

        // Find the first missing positive
        for (int i = 0; i < n; i++) {
            if (nums[i] != i + 1) {
                return i + 1;
            }
        }

        return n + 1;
    }

    // Function to perform Binary Search for the target element
    public static int binarySearch(int[] arr, int target) {
        int left = 0, right = arr.length - 1;

        while (left <= right) {
            int mid = left + (right - left) / 2;

            if (arr[mid] == target) {
                return mid;
            } else if (arr[mid] < target) {
                left = mid + 1;
            } else {
                right = mid - 1;
            }
        }

        return -1;
    }

    public static void main(String[] args) {
        int[] nums = {3, 4, -1, 1};
        int missing = findFirstMissingPositive(nums);
        System.out.println("First missing positive integer: " + missing);

        int[] sortedArr = {1, 2, 3, 4, 5, 6, 7};
        int target = 4;
        int index = binarySearch(sortedArr, target);
        System.out.println("Index of target (" + target + "): " + index);
    }
}

