package challenge_problem;

import java.io.*;

public class Compare {
    public static void main(String[] args) {
        // Measure performance of StringBuilder and StringBuffer
        measureStringConcatenation();

        String filePath = "Engineering.txt";

        // Measure performance of FileReader and InputStreamReader
        measureFileReading(filePath);
    }

    private static void measureStringConcatenation() {
        String str = "hello";
        int iterations = 1_000_000;

        // Using StringBuilder
        long startTime = System.nanoTime();
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < iterations; i++) {
            sb.append(str);
        }
        long endTime = System.nanoTime();
        System.out.println("StringBuilder time: " + (endTime - startTime) / 1_000_000 + " ms");

        // Using StringBuffer
        startTime = System.nanoTime();
        StringBuffer sbf = new StringBuffer();
        for (int i = 0; i < iterations; i++) {
            sbf.append(str);
        }
        endTime = System.nanoTime();
        System.out.println("StringBuffer time: " + (endTime - startTime) / 1_000_000 + " ms");
    }

    private static void measureFileReading(String filePath) {
        try {
            // Using FileReader
            long startTime = System.nanoTime();
            int wordCount = countWordsUsingFileReader(filePath);
            long endTime = System.nanoTime();
            System.out.println("FileReader Word Count: " + wordCount);
            System.out.println("FileReader time: " + (endTime - startTime) / 1_000_000 + " ms");

            // Using InputStreamReader
            startTime = System.nanoTime();
            wordCount = countWordsUsingInputStreamReader(filePath);
            endTime = System.nanoTime();
            System.out.println("InputStreamReader Word Count: " + wordCount);
            System.out.println("InputStreamReader time: " + (endTime - startTime) / 1_000_000 + " ms");
        } catch (IOException e) {
            System.out.println("Error reading file: " + e.getMessage());
        }
    }

    private static int countWordsUsingFileReader(String filePath) throws IOException {
        FileReader fileReader = new FileReader(filePath);
        BufferedReader br = new BufferedReader(fileReader);
        int wordCount = 0;
        String line;
        while ((line = br.readLine()) != null) {
            wordCount += line.split("\\s+").length;
        }
        br.close();
        return wordCount;
    }

    private static int countWordsUsingInputStreamReader(String filePath) throws IOException {
        InputStreamReader isr = new InputStreamReader(new FileInputStream(filePath));
        BufferedReader br = new BufferedReader(isr);
        int wordCount = 0;
        String line;
        while ((line = br.readLine()) != null) {
            wordCount += line.split("\\s+").length;
        }
        br.close();
        return wordCount;
    }
}
