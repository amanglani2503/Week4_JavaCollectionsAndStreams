package day4exceptionhandling.multiplecatch;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

public class RetrieveElementTest {

    @Test
    void testValidIndex() {
        int[] arr = {10, 20, 30, 40, 50};
        assertEquals(10, RetrieveElement.retrieveElement(arr, 0)); // arr[0] = 10
        assertEquals(50, RetrieveElement.retrieveElement(arr, 4)); // arr[4] = 50
    }

    @Test
    void testInvalidNegativeIndex() {
        int[] arr = {1, 2, 3};
        Exception exception = assertThrows(CustomArrayIndexOutOfBoundsException.class,
                () -> RetrieveElement.retrieveElement(arr, -1));
        assertEquals("Invalid Index", exception.getMessage());
    }

    @Test
    void testInvalidOutOfBoundsIndex() {
        int[] arr = {5, 10, 15};
        Exception exception = assertThrows(CustomArrayIndexOutOfBoundsException.class,
                () -> RetrieveElement.retrieveElement(arr, 3)); // arr.length is 3, so max index = 2
        assertEquals("Invalid Index", exception.getMessage());
    }

    @Test
    void testNullArray() {
        int[] arr = null;
        Exception exception = assertThrows(CustomNullPointerException.class,
                () -> RetrieveElement.retrieveElement(arr, 0));
        assertEquals("Array is not initialized", exception.getMessage());
    }
}
