package doubly_linked_list.undo_redo_functionality;

public class UndoRedoFunctionality {
    private TextStateNode head;
    private TextStateNode current;
    private final int maxHistorySize = 10; // Limit for undo/redo history
    private int currentSize = 0;

    // Add a new text state
    public void addState(String text) {
        TextStateNode newNode = new TextStateNode(text);

        // Clear redo history
        if (current != null && current.next != null) {
            current.next = null;
        }

        if (head == null) {
            head = newNode;
        } else {
            current.next = newNode;
            newNode.prev = current;
        }
        current = newNode;

        // Maintain history size limit
        if (currentSize == maxHistorySize) {
            head = head.next;
            head.prev = null;
        } else {
            currentSize++;
        }

        System.out.println("State added: \"" + text + "\"");
    }

    // Undo functionality
    public void undo() {
        if (current == null || current.prev == null) {
            System.out.println("No more states to undo.");
            return;
        }
        current = current.prev;
        System.out.println("Undo performed. Current state: \"" + current.textState + "\"");
    }

    // Redo functionality
    public void redo() {
        if (current == null || current.next == null) {
            System.out.println("No more states to redo.");
            return;
        }
        current = current.next;
        System.out.println("Redo performed. Current state: \"" + current.textState + "\"");
    }

    // Display the current state
    public void displayCurrentState() {
        if (current == null) {
            System.out.println("No states available.");
        } else {
            System.out.println("Current state: \"" + current.textState + "\"");
        }
    }

    // Display all states (for debugging purposes)
    public void displayAllStates() {
        TextStateNode temp = head;
        System.out.println("All states:");
        while (temp != null) {
            System.out.print("\"" + temp.textState + "\"");
            if (temp == current) {
                System.out.print(" (current)");
            }
            System.out.println();
            temp = temp.next;
        }
    }

    public static void main(String[] args) {
        UndoRedoFunctionality editor = new UndoRedoFunctionality();

        // Simulating actions
        editor.addState("Nancy");
        editor.addState("Nancy Mehra");
        editor.addState("Nancy Mehra!");
        editor.addState("Nancy Mehra!!");

        // Display current state
        editor.displayCurrentState();

        // Perform undo
        editor.undo();
        editor.undo();

        // Perform redo
        editor.redo();

        // Add a new state (clears redo history)
        editor.addState("Hey!!!");

        // Display all states
        editor.displayAllStates();

        // Perform undo
        editor.undo();

        // Display current state
        editor.displayCurrentState();
    }
}

