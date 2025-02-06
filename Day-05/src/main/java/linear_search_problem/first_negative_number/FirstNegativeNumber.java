package linear_search_problem.first_negative_number;

public class FirstNegativeNumber{
    public static int findFirstNegative(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            // Check if the element is negative
            if (arr[i] < 0) {
                return i;
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        int[] arr = {1,8,9,-2,-3};
        int index = findFirstNegative(arr);
        System.out.println("First negative number index: " + index);
    }
}

