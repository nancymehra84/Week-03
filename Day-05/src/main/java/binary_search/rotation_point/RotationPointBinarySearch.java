package binary_search.rotation_point;

public class RotationPointBinarySearch {
    public static int findRotationPoint(int[] arr) {
        int left = 0, right = arr.length - 1;

        while (left < right) {
            // Calculate mid
            int mid = left + (right - left) / 2;

            if (arr[mid] > arr[right]) {
                // Rotation point is in the right
                left = mid + 1;
            } else {
                // Rotation point is in the left
                right = mid;
            }
        }
        //rotation point
        return left;
    }

    public static void main(String[] args) {
        int[] arr = { 5, 6, 7, 0, 1};
        int index = findRotationPoint(arr);
        System.out.println("Index of the smallest element (rotation point): " + index);
    }
}
