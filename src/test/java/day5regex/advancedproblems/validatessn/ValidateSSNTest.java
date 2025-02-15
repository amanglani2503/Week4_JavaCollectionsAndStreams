package day5regex.advancedproblems.validatessn;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class ValidateSSNTest {

    @Test
    void testIsValid_withValidSSN() {
        assertTrue(ValidateSSN.isValid("123-45-6789"));
        assertTrue(ValidateSSN.isValid("987-65-4321"));
    }

    @Test
    void testIsValid_withInvalidSSNFormats() {
        assertFalse(ValidateSSN.isValid("123-456-789")); // Incorrect grouping
        assertFalse(ValidateSSN.isValid("123456789")); // Missing dashes
        assertFalse(ValidateSSN.isValid("12-345-6789")); // Incorrect first part
        assertFalse(ValidateSSN.isValid("123-45-67890")); // Too many digits
        assertFalse(ValidateSSN.isValid("abc-de-ghij")); // Non-numeric characters
    }

    @Test
    void testIsValid_withEmptyString() {
        assertFalse(ValidateSSN.isValid(""));
    }

    @Test
    void testIsValid_withSpecialCharacters() {
        assertFalse(ValidateSSN.isValid("123-@5-6789"));
    }
}
