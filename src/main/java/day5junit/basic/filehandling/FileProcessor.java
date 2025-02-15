package day5junit.basic.filehandling;

import java.io.*;

public class FileProcessor {

    public static void writeToFile(String filename, String content) throws IOException {
        try (BufferedWriter writer = new BufferedWriter(new FileWriter(filename))) {
            writer.write(content);
        }
    }

    public static String readFromFile(String filename) throws IOException {
        try (BufferedReader reader = new BufferedReader(new FileReader(filename))) {
            StringBuilder content = new StringBuilder();
            String line;
            while ((line = reader.readLine()) != null) {
                content.append(line);
            }
            return content.toString();
        }
    }

    public static void main(String[] args) {
        String filename = "E:\\Files\\Sample.txt";
        String content = "Hello, Everyone!";

        try {
            writeToFile(filename, content);
            System.out.println("Written to file: " + content);
            String readContent = readFromFile(filename);
            System.out.println("Read from file: " + readContent);
        } catch (IOException e) {
            System.err.println("Error: " + e.getMessage());
        }
    }
}
