package stack_and_queue.stack_using_recursion;

import java.util.Stack;

public class StackUsingRecursion {
    // Function to insert an element in a sorted way
    public static void sortedInsert(Stack<Integer> stack, int element) {
        if (stack.isEmpty() || stack.peek() <= element) {
            stack.push(element);
        } else {
            int temp = stack.pop();
            sortedInsert(stack, element);
            stack.push(temp);
        }
    }

    // Recursive function to sort the stack
    public static void sortStack(Stack<Integer> stack) {
        if (!stack.isEmpty()) {
            int temp = stack.pop();
            sortStack(stack);
            sortedInsert(stack, temp);
        }
    }

    // Main method to test the sorting function
    public static void main(String[] args) {
        Stack<Integer> stack = new Stack<>();
        stack.push(6);
        stack.push(2);
        stack.push(5);
        stack.push(4);
        stack.push(3);

        System.out.println("Original Stack: " + stack);
        sortStack(stack);
        System.out.println("Sorted Stack: " + stack);
    }
}

