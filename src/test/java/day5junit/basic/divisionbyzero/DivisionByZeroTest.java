package day5junit.basic.divisionbyzero;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

class DivisionByZeroTest {

    @Test
    void testDivideByZero() {
        Exception exception = assertThrows(ArithmeticException.class, () -> {
            DivisionByZero.divide(10, 0);
        });
        assertEquals("Cannot divide by zero", exception.getMessage());
    }

    @Test
    void testDivideValidNumbers() {
        assertEquals(5, DivisionByZero.divide(10, 2));
    }
}
