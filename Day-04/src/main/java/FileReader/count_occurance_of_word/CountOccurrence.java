package FileReader.count_occurance_of_word;

import java.io.*;

public class CountOccurrence {
    public static void main(String[] args) {
        String fileName = "Engineering.txt";
        String targetWord = "Engineering";

        int count = countWordOccurrences(fileName, targetWord);
        System.out.println("The word \"" + targetWord + "\" appears " + count + " times in the file.");
    }

    public static int countWordOccurrences(String fileName, String targetWord) {
        int count = 0;

        try (FileReader fr = new FileReader(fileName);
             BufferedReader br = new BufferedReader(fr)) {

            String line;
            while ((line = br.readLine()) != null) {
                String[] words = line.split("\\s+");
                for (String word : words) {
                    if (word.equalsIgnoreCase(targetWord)) {
                        count++;
                    }
                }
            }

        } catch (IOException e) {
            System.out.println("Error reading file: " + e.getMessage());
        }

        return count;
    }
}

