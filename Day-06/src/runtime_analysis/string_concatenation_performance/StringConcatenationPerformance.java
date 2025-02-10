package runtime_analysis.string_concatenation_performance;

public class StringConcatenationPerformance{
    public static void main(String[] args) {
        int[] sizes = {1000, 10000, 1000000};

        for (int n : sizes) {
            System.out.println("Count of Operation: " + n);

            // Measure String concatenation time (O(N²))
            long startTime = System.nanoTime();
            String str = "";
            for (int i = 0; i < n; i++) {
                str =str+ "n";
            }
            long stringTime = System.nanoTime() - startTime;
            System.out.println("String: " + (stringTime /(float) 1_000_000) + " ms");

            // Measure StringBuilder concatenation time (O(N))
            startTime = System.nanoTime();
            StringBuilder SB = new StringBuilder();
            for (int i = 0; i < n; i++) {
                SB.append("a");
            }
            long stringBuilderTime = System.nanoTime() - startTime;
            System.out.println("StringBuilder: " + (stringBuilderTime /(float)1_000_000) + " ms");

            // Measure StringBuffer concatenation time (O(N))
            startTime = System.nanoTime();
            StringBuffer sb = new StringBuffer();
            for (int i = 0; i < n; i++) {
                sb.append("a");
            }
            long stringBufferTime = System.nanoTime() - startTime;
            System.out.println("StringBuffer: " + (stringBufferTime / (float)1_000_000) + " ms");
        }
    }
}

