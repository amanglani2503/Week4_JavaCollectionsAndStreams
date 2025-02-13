package day4exceptionhandling.trywithresources;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class FileRead {
    public static void readFile(String filepath) throws CustomIOException{
        try(BufferedReader bufferedReader = new BufferedReader(new FileReader(filepath))){
            String line;

            while((line = bufferedReader.readLine()) != null){
                System.out.println(line);
            }

            System.out.println("File read successfully");
        } catch (IOException e){
            throw new CustomIOException("Error reading file !!");
        }
    }

    public static void main(String[] args) {
        String filepath = "E:\\Files\\Essay.txt";

        try{
            readFile(filepath);
        } catch (CustomIOException e){
            System.out.println("Exception : " + e.getMessage());
        }
    }
}
