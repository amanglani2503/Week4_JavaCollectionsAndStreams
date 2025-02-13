package day4exceptionhandling.finallyblock;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;
import java.util.InputMismatchException;

public class DivisionTest {

    @Test
    void testValidDivision() {
        assertEquals(5, Division.divide(10, 2)); // 10 / 2 = 5
        assertEquals(3, Division.divide(15, 5)); // 15 / 5 = 3
    }

    @Test
    void testDivisionByZero() {
        Exception exception = assertThrows(CustomArithmeticException.class,
                () -> Division.divide(10, 0));
        assertEquals("Division by zero !!", exception.getMessage());
    }

    @Test
    void testInputMismatch() {
        Exception exception = assertThrows(InputMismatchException.class,
                () -> {
                    throw new InputMismatchException("Input mismatch! Please enter an integer.");
                });
        assertEquals("Input mismatch! Please enter an integer.", exception.getMessage());
    }
}
