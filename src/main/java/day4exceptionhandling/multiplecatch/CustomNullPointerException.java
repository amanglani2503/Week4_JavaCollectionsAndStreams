package day4exceptionhandling.multiplecatch;

public class CustomNullPointerException extends NullPointerException{
    public CustomNullPointerException(String message) {
        super(message);
    }
}
