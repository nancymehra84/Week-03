package input_stream_reader.byte_stream_to_charachter_stream;

import java.io.*;

public class FileToInput {
    public static void main(String[] args) {
        // Specify the file path
        String filePath = "Engineering.txt";

        // Specify the charset
        String charset = "UTF-8";

        try (
                FileInputStream fileInputStream = new FileInputStream(filePath);
                InputStreamReader inputStreamReader = new InputStreamReader(fileInputStream, charset);
                BufferedReader bufferedReader = new BufferedReader(inputStreamReader)
        ) {
            String line;
            while ((line = bufferedReader.readLine()) != null) {
                System.out.println(line); // Print the line
            }
        } catch (UnsupportedEncodingException e) {
            System.err.println("Unsupported Encoding: " + e.getMessage());
        } catch (FileNotFoundException e) {
            System.err.println("File not found: " + e.getMessage());
        } catch (IOException e) {
            System.err.println("I/O error: " + e.getMessage());
        }
    }
}
