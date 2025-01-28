package circular_linked_list.task_schedular;

public class TaskSchedular {
    public static void main(String[] args) {
        CircularLinkedList taskScheduler = new CircularLinkedList();

        // Adding tasks at the beginning
        taskScheduler.addTaskAtBeginning(101, "Task 1", 1, "2025-02-01");
        taskScheduler.addTaskAtBeginning(102, "Task 2", 3, "2025-02-02");

        // Adding tasks at the end
        taskScheduler.addTaskAtEnd(103, "Task 3", 2, "2025-02-03");
        taskScheduler.addTaskAtEnd(104, "Task 4", 1, "2025-02-04");

        // Adding tasks at specific position
        taskScheduler.addTaskAtPosition(2, 105, "Task 5", 2, "2025-02-05");
        taskScheduler.addTaskAtPosition(0, 106, "Task 6", 1, "2025-02-06");

        // Display all tasks
        System.out.println("Displaying All Tasks ");
        taskScheduler.displayAllTasks();

        // Remove task by ID
        taskScheduler.removeTaskById(103);

        // Display tasks after removal
        System.out.println("Displaying All Tasks After Removal");
        taskScheduler.displayAllTasks();

        // View current task and move to next task
        System.out.println(" Viewing Current Task");
        taskScheduler.viewCurrentTask(); // First task
        taskScheduler.viewCurrentTask(); // Second task

        // Search tasks by priority
        System.out.println("Searching Tasks by Priority (1) ");
        taskScheduler.searchTaskByPriority(1);

        // Search tasks by priority
        System.out.println("Searching Tasks by Priority (2) ");
        taskScheduler.searchTaskByPriority(2);
    }
}

