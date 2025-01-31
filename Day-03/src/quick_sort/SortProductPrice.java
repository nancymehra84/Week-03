package quick_sort;

import java.util.Arrays;

public class SortProductPrice {

    // Method to perform Quick Sort
    public static void quickSort(double[] prices, int low, int high) {
        if (low < high) {
            int pivotIndex = partition(prices, low, high);
            quickSort(prices, low, pivotIndex - 1);
            quickSort(prices, pivotIndex + 1, high);
        }
    }

    // Partition method to place pivot in the correct position
    private static int partition(double[] prices, int low, int high) {
        double pivot = prices[high]; // Choosing the last element as pivot
        int i = low - 1;

        for (int j = low; j < high; j++) {
            if (prices[j] < pivot) {
                i++;
                swap(prices, i, j);
            }
        }
        swap(prices, i + 1, high);
        return i + 1;
    }

    // Swap method to exchange two elements
    private static void swap(double[] prices, int i, int j) {
        double temp = prices[i];
        prices[i] = prices[j];
        prices[j] = temp;
    }

    // Main method to test Quick Sort
    public static void main(String[] args) {
        double[] prices = {200,15,230,75,98};

        quickSort(prices, 0, prices.length - 1);

        System.out.println("Sorted Prices: " + Arrays.toString(prices));
    }
}

