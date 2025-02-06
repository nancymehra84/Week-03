package binary_search.peak_element;

public class PeakElementBinarySearch {
    public static int findPeakElement(int[] arr) {
        int left = 0, right = arr.length - 1;

        while (left < right) {
            int mid = left + (right - left) / 2;

            if (arr[mid] > arr[mid + 1]) {
                // If mid is greater , peak is in the left half
                right = mid;
            } else {
                // If mid is smaller, peak is in the right half
                left = mid + 1;
            }
        }

        return left; // The index of a peak element
    }

    public static void main(String[] args) {
        int[] arr = {1, 3, 20, 4, 1, 0};
        int peakIndex = findPeakElement(arr);
        System.out.println("Peak element is at index: " + peakIndex);
        System.out.println("Peak element value: " + arr[peakIndex]);
    }
}

