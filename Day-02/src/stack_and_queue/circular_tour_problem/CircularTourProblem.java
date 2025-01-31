package stack_and_queue.circular_tour_problem;

class CircularTourProblem {
    // Function to find the starting petrol pump
    public static int findStartingPump(int[] petrol, int[] distance) {
        int totalSurplus = 0;  // Total surplus petrol
        int totalDeficit = 0;  // Total deficit petrol
        int start = 0;         // Starting index of circular tour
        int currentSurplus = 0; // Current petrol balance

        for (int i = 0; i < petrol.length; i++) {
            int netGain = petrol[i] - distance[i];
            currentSurplus += netGain;
            totalSurplus += netGain;

            // If deficit occurs, reset starting index
            if (currentSurplus < 0) {
                start = i + 1;
                totalDeficit += currentSurplus;
                currentSurplus = 0;
            }
        }

        // If the total surplus + deficit is non-negative, return start index
        return (totalSurplus + totalDeficit >= 0) ? start : -1;
    }

    public static void main(String[] args) {
        int[] petrol = {5,8,9,5};
        int[] distance = {9,8,6,4};

        int startIndex = findStartingPump(petrol, distance);
        System.out.println("Starting Pump Index: " + startIndex);
    }
}

