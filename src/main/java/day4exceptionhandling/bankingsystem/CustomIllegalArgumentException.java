package day4exceptionhandling.bankingsystem;

public class CustomIllegalArgumentException extends Exception{
    public CustomIllegalArgumentException(String message) {
        super(message);
    }
}
