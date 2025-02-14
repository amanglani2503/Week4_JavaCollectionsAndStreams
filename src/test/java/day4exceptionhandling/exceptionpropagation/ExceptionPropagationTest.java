package day4exceptionhandling.exceptionpropagation;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

class ExceptionPropagationTest {

    @Test
    void testMethod1_ThrowsArithmeticException() {
        Exception exception = assertThrows(ArithmeticException.class, ExceptionPropagation::method1);
        assertEquals("/ by zero", exception.getMessage());
    }

    @Test
    void testMethod2_ThrowsArithmeticException() {
        Exception exception = assertThrows(ArithmeticException.class, ExceptionPropagation::method2);
        assertEquals("/ by zero", exception.getMessage());
    }
}
