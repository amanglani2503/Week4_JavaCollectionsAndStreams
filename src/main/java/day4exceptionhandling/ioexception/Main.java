package day4exceptionhandling.ioexception;

public class Main {
    public static void main(String[] args) {
        String filepath = "C:\\Users\\win\\OneDrive\\Desktop\\Notes\\Essays\\Digital.txt";

        ReadFile reader = new ReadFile();
        try{
            reader.readFile(filepath);
        } catch (CustomIOException e) {
            System.out.println(e.getMessage());
        }
    }
}
