package FileReader.read_file_linebyline;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class ReadFile {
    public static void main(String[] args){
        //Specify File path
        String FilePath="Engineering.txt";

        //create fileReader and fileBuilder
        try(BufferedReader br=new BufferedReader(new FileReader(FilePath))){
            String Line;
            while((Line=br.readLine())!=null){
                System.out.println(Line);
            }
        }catch (IOException e){
            e.printStackTrace();
        }
    }
}
