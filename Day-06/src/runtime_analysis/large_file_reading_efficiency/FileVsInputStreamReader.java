package runtime_analysis.large_file_reading_efficiency;

import java.io.*;

public class FileVsInputStreamReader {
    public static void main(String[] args) {
        String filePath = "Engineering.txt"; //file path

        System.out.println("Reading performance comparison for: " + filePath);

        // Measure FileReader time
        long startTime = System.nanoTime();
        try (FileReader fileReader = new FileReader(filePath)) {
            while (fileReader.read() != -1) {}
        } catch (IOException e) {
            System.out.println("FileReader Error: " + e.getMessage());
        }
        long fileReaderTime = System.nanoTime() - startTime;
        System.out.println("FileReader Time: " + (fileReaderTime / 1_000_000) + " ms");

        // Measure InputStreamReader time
        startTime = System.nanoTime();
        try (InputStreamReader inputStreamReader = new InputStreamReader(new FileInputStream(filePath))) {
            while (inputStreamReader.read() != -1) {} // Reads bytes and converts to characters
        } catch (IOException e) {
            System.out.println("InputStreamReader Error: " + e.getMessage());
        }
        long inputStreamReaderTime = System.nanoTime() - startTime;
        System.out.println("InputStreamReader Time: " + (inputStreamReaderTime / 1_000_000) + " ms");
    }
}

