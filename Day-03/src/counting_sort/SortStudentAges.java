package counting_sort;

import java.util.Arrays;

public class SortStudentAges {

    // Method to perform Counting Sort
    public static void countingSort(int[] ages, int minAge, int maxAge) {
        int range = maxAge - minAge + 1;
        int[] count = new int[range];
        int[] output = new int[ages.length];

        // Count occurrences of each age
        for (int age : ages) {
            count[age - minAge]++;
        }

        for (int i = 1; i < range; i++) {
            count[i] += count[i - 1];
        }

        // Place elements in sorted order
        for (int i = ages.length - 1; i >= 0; i--) {
            output[count[ages[i] - minAge] - 1] = ages[i];
            count[ages[i] - minAge]--;
        }

        // Copy sorted elements back to original array
        System.arraycopy(output, 0, ages, 0, ages.length);
    }

    // Main method
    public static void main(String[] args) {
        int[] ages = {12, 15, 10, 18, 16, 14, 17, 11, 13, 12, 15, 14};

        countingSort(ages, 10, 18);

        System.out.println("Sorted Ages: " + Arrays.toString(ages));
    }
}
