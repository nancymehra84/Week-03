package binary_search.search_2d_matrix;

public class Search2DMatrix {
    public static boolean searchMatrix(int[][] matrix, int target) {
        if (matrix == null || matrix.length == 0 || matrix[0].length == 0) {
            return false;
        }

        int rows = matrix.length, cols = matrix[0].length;
        int left = 0, right = rows * cols - 1;

        while (left <= right) {
            int mid = left + (right - left) / 2; // Calculate middle index
            int row = mid / cols, col = mid % cols;

            if (matrix[row][col] == target) {
                return true; // Target found
            } else if (matrix[row][col] < target) {
                left = mid + 1; // Search right half
            } else {
                right = mid - 1; // Search left half
            }
        }

        return false; // Target not found
    }

    public static void main(String[] args) {
        int[][] matrix = {
                {1, 3, 5, 7},
                {10, 11, 16, 20},
                {23, 30, 34, 60}
        };

        int target = 3; // Example target value
        boolean found = searchMatrix(matrix, target);
        System.out.println("Target found: " + found);
    }
}

