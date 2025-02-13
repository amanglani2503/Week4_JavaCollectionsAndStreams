package day4exceptionhandling.invalidageexception;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;
import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

public class ValidateAgeTest {

    @Test
    void testValidAge() {
        try {
            ValidateAge.validateAge(20); // Valid case (age ≥ 18)
        } catch (InvalidAgeException e) {
            fail("Exception should not be thrown for valid age.");
        }
    }

    @Test
    void testValidEdgeCase() {
        try {
            ValidateAge.validateAge(18); // Edge case (exactly 18)
        } catch (InvalidAgeException e) {
            fail("Exception should not be thrown for age 18.");
        }
    }

    @Test
    void testInvalidAge() {
        Exception exception = assertThrows(InvalidAgeException.class, () -> ValidateAge.validateAge(15));
        assertEquals("Age must be 18 or above", exception.getMessage());
    }

    @Test
    void testValidAgeWithOutput() {
        // Capture system output
        ByteArrayOutputStream outContent = new ByteArrayOutputStream();
        System.setOut(new PrintStream(outContent));

        try {
            ValidateAge.validateAge(21);
        } catch (InvalidAgeException e) {
            fail("Exception should not be thrown for valid age.");
        }

        // Assert that "Access Granted" is printed
        assertTrue(outContent.toString().contains("Access Granted"));

        // Reset System.out
        System.setOut(System.out);
    }
}
