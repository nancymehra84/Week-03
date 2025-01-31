package stack_and_queue.stock_span_problem;

import java.util.Stack;

public class StockSpanProblem {
    public static int[] calculateSpan(int[] prices) {
        int n = prices.length;
        int[] span = new int[n];
        Stack<Integer> stack = new Stack<>();

        for (int i = 0; i < n; i++) {

            while (!stack.isEmpty() && prices[stack.peek()] <= prices[i]) {
                stack.pop();
            }

            // If stack is empty, span is i+1 (all previous prices are lower)
            span[i] = (stack.isEmpty()) ? (i + 1) : (i - stack.peek());

            // Push current index to stack
            stack.push(i);
        }

        return span;
    }

    public static void main(String[] args) {
        int[] prices = {100, 80, 60, 70, 60, 75, 85};
        int[] spans = calculateSpan(prices);

        System.out.print("Stock Spans: ");
        for (int span : spans) {
            System.out.print(span + " ");
        }
    }
}

