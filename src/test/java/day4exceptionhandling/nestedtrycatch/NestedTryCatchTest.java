package day4exceptionhandling.nestedtrycatch;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

class NestedTryCatchTest {

    @Test
    void testDivide_ValidInputs() {
        int[] arr = {2, 6, 7, 4, 9, 8, 1};
        int divisor = 3;
        int index = 4;
        int expected = arr[index] / divisor;

        assertEquals(expected, NestedTryCatch.divide(arr, divisor, index));
    }

    @Test
    void testDivide_DivideByZero() {
        int[] arr = {2, 6, 7, 4, 9, 8, 1};
        int divisor = 0;
        int index = 4;

        Exception exception = assertThrows(ArithmeticException.class, () ->
                NestedTryCatch.divide(arr, divisor, index));

        assertEquals("Cannot divide by zero", exception.getMessage());
    }

    @Test
    void testDivide_InvalidIndex() {
        int[] arr = {2, 6, 7, 4, 9, 8, 1};
        int divisor = 3;
        int index = 10;

        Exception exception = assertThrows(ArrayIndexOutOfBoundsException.class, () ->
                NestedTryCatch.divide(arr, divisor, index));

        assertEquals("Invalid array index", exception.getMessage());
    }
}
