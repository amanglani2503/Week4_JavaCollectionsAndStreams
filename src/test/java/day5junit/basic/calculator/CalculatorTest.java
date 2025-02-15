package day5junit.basic.calculator;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

class CalculatorTest {

    private final Calculator calculator = new Calculator();

    @Test
    void testAdd() {
        assertEquals(5, calculator.add(2, 3));
        assertEquals(-1, calculator.add(-2, 1));
        assertEquals(0, calculator.add(0, 0));
    }

    @Test
    void testSubtract() {
        assertEquals(1, calculator.subtract(3, 2));
        assertEquals(-3, calculator.subtract(-2, 1));
        assertEquals(0, calculator.subtract(5, 5));
    }

    @Test
    void testMultiply() {
        assertEquals(6, calculator.multiply(2, 3));
        assertEquals(-2, calculator.multiply(-1, 2));
        assertEquals(0, calculator.multiply(0, 5));
    }

    @Test
    void testDivide() {
        assertEquals(2, calculator.divide(6, 3));
        assertEquals(-2, calculator.divide(-4, 2));

        Exception exception = assertThrows(ArithmeticException.class, () -> calculator.divide(5, 0));
        assertEquals("Cannot divide by zero", exception.getMessage());
    }
}
