package circular_linked_list.round_robin_scheduling_algorithm;

class ProcessNode {
    int processId;
    int burstTime;
    int priority;
    ProcessNode next;

    // Constructor
    public ProcessNode(int processId, int burstTime, int priority) {
        this.processId = processId;
        this.burstTime = burstTime;
        this.priority = priority;
    }
}


