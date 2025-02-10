package runtime_analysis.recursive_vs_iterative_fibonacci_computation;

public class RecursiveVsIterative {
    public static void main(String[] args) {
        int[] testValues = {10, 30, 50}; // Fibonacci numbers to compute

        for (int n : testValues) {
            System.out.println("Fibonacci(" + n + ")");

            // Measure Recursive Fibonacci time (O(2ⁿ))
            long startTime = System.nanoTime();
            int recursiveResult = fibonacciRecursive(n);
            long recursiveTime = System.nanoTime() - startTime;

            // Measure Iterative Fibonacci time (O(N))
            startTime = System.nanoTime();
            int iterativeResult = fibonacciIterative(n);
            long iterativeTime = System.nanoTime() - startTime;

            System.out.println("Recursive Result: " + recursiveResult + " | Time: " + (recursiveTime / 1_000_000) + " ms");
            System.out.println("Iterative Result: " + iterativeResult + " | Time: " + (iterativeTime / 1_000_000) + " ms");
        }
    }

    // Recursive Fibonacci (O(2ⁿ)) - Inefficient for large n
    public static int fibonacciRecursive(int n) {
        if (n <= 1) return n;
        return fibonacciRecursive(n - 1) + fibonacciRecursive(n - 2);
    }

    // Iterative Fibonacci (O(N)) - Efficient
    public static int fibonacciIterative(int n) {
        if (n <= 1) return n;
        int a = 0, b = 1, sum;
        for (int i = 2; i <= n; i++) {
            sum = a + b;
            a = b;
            b = sum;
        }
        return b;
    }
}
