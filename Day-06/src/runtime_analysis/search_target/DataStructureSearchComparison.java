package runtime_analysis.search_target;

import java.util.*;

public class DataStructureSearchComparison {
    public static void main(String[] args) {
        int[] sizes = {1_000, 100_000, 1_000_000};

        for (int size : sizes) {
            List<Integer> arrayList = new ArrayList<>();
            Set<Integer> hashSet = new HashSet<>();
            Set<Integer> treeSet = new TreeSet<>();

            Random rand = new Random();

            // Populate data structures with random integers
            for (int i = 0; i < size; i++) {
                int num = rand.nextInt(size * 10);
                arrayList.add(num);
                hashSet.add(num);
                treeSet.add(num);
            }

            // Pick a random element
            int target = arrayList.get(rand.nextInt(size));

            //  (Linear Search)
            long startTime = System.nanoTime();
            arrayList.contains(target);
            long arrayTime = (System.nanoTime() - startTime) / 1_000_000; // Convert to milliseconds

            // Measure search time in HashSet
            startTime = System.nanoTime();
            hashSet.contains(target);
            long hashSetTime = (System.nanoTime() - startTime) / 1_000_000;

            // Measure search time in TreeSet
            startTime = System.nanoTime();
            treeSet.contains(target);
            long treeSetTime = (System.nanoTime() - startTime) / 1_000_000;


            System.out.println("For N = " + size);
            System.out.println("Array Search Time: " + arrayTime + " ms");
            System.out.println("HashSet Search Time: " + hashSetTime + " ms");
            System.out.println("TreeSet Search Time: " + treeSetTime + " ms");
            System.out.println();
        }
    }
}


