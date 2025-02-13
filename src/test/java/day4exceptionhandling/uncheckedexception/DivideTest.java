package day4exceptionhandling.uncheckedexception;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

public class DivideTest {

    @Test
    void testValidDivision() {
        assertEquals(5, Divide.divide(10, 2));
        assertEquals(-3, Divide.divide(-9, 3));
        assertEquals(0, Divide.divide(0, 5)); // 0 divided by anything should be 0
    }

    @Test
    void testDivisionByZero() {
        Exception exception = assertThrows(CustomArithmeticException.class, () -> Divide.divide(10, 0));
        assertEquals("Division by zero !!", exception.getMessage());
    }

}
