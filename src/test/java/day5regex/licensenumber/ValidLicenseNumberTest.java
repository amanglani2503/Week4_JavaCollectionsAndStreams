package day5regex.licensenumber;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
import java.util.regex.Pattern;

class ValidLicenseNumberTest {

    // License number regex pattern
    private static final String REGEX = "[A-Z]{2}[0-9]{4}$";
    private static final Pattern pattern = Pattern.compile(REGEX);

    // Helper method to check if the license number is valid
    private boolean isValidLicenseNumber(String licenseNumber) {
        return pattern.matcher(licenseNumber).matches();
    }

    @Test
    void testValidLicenseNumbers() {
        assertTrue(isValidLicenseNumber("AB1234"), "Valid license number failed");
        assertTrue(isValidLicenseNumber("XY9876"), "Valid license number failed");
        assertTrue(isValidLicenseNumber("CD5678"), "Valid license number failed");
        assertTrue(isValidLicenseNumber("LM0001"), "Valid license number failed");
    }

    @Test
    void testInvalidLicenseNumbers() {
        assertFalse(isValidLicenseNumber("A1234"), "License number must have exactly 2 letters");
        assertFalse(isValidLicenseNumber("ABC1234"), "License number must have exactly 2 letters");
        assertFalse(isValidLicenseNumber("AB12"), "License number must have exactly 4 digits");
        assertFalse(isValidLicenseNumber("AB12345"), "License number must have exactly 4 digits");
        assertFalse(isValidLicenseNumber("ab1234"), "Letters must be uppercase");
        assertFalse(isValidLicenseNumber("XY12AB"), "Digits must be at the end");
        assertFalse(isValidLicenseNumber("1234AB"), "Must start with letters");
        assertFalse(isValidLicenseNumber("A1B2C3"), "Invalid format");
    }
}
