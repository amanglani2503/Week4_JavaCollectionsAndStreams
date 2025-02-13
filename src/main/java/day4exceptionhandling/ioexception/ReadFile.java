package day4exceptionhandling.ioexception;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class ReadFile {
    public void readFile(String filepath) throws CustomIOException{
        try(BufferedReader bufferedReader = new BufferedReader(new FileReader(filepath))){
            String line;

            while((line = bufferedReader.readLine()) != null){
                System.out.println(line);
            }

            bufferedReader.close();
        } catch (IOException e){
            throw new CustomIOException("File not found !!");
        }
    }
}
