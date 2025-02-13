package day4exceptionhandling.multiplecatch;

public class CustomArrayIndexOutOfBoundsException extends ArrayIndexOutOfBoundsException{
    public CustomArrayIndexOutOfBoundsException(String message) {
        super(message);
    }
}
