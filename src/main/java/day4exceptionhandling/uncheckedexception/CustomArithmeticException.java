package day4exceptionhandling.uncheckedexception;

public class CustomArithmeticException extends ArithmeticException{
    public CustomArithmeticException(String message) {
        super(message);
    }
}
