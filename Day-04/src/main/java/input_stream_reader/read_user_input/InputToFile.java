package input_stream_reader.read_user_input;

import java.io.*;

public class InputToFile {
    public static void main(String[] args) {
        String filePath = "Engineering.txt";

        try (
                InputStreamReader inputStreamReader = new InputStreamReader(System.in);
                BufferedReader bufferedReader = new BufferedReader(inputStreamReader);
                FileWriter fileWriter = new FileWriter(filePath, true); // Append mode
                BufferedWriter bufferedWriter = new BufferedWriter(fileWriter)
        ) {
            System.out.println("Enter text (type 'exit' to stop):");
            String input;

            while (!(input = bufferedReader.readLine()).equalsIgnoreCase("exit")) {
                bufferedWriter.write(input);
                bufferedWriter.newLine(); // Write a new line
            }

            System.out.println("Input saved to " + filePath);
        } catch (IOException e) {
            System.err.println("I/O error: " + e.getMessage());
        }
    }
}
