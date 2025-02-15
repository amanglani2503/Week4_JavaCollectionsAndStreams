package day5regex.basicregexproblems.validateusername;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
import java.util.regex.Pattern;

class ValidateUsernameTest {

    // Regex pattern
    private static final String REGEX = "[a-zA-Z][a-zA-Z0-9_]{4,14}";
    private static final Pattern pattern = Pattern.compile(REGEX);

    // Helper method to test validation
    private boolean isValidUsername(String username) {
        return pattern.matcher(username).matches();
    }

    @Test
    void testValidUsernames() {
        assertTrue(isValidUsername("Amber123"), "Valid username failed");
        assertTrue(isValidUsername("john_doe99"), "Valid username failed");
        assertTrue(isValidUsername("A1_B2C3"), "Valid username failed");
        assertTrue(isValidUsername("Z_abc_123"), "Valid username failed");
        assertTrue(isValidUsername("Test_99"), "Valid username failed");
    }

    @Test
    void testInvalidUsernames() {
        assertFalse(isValidUsername("123Amber"), "Username starting with a number should be invalid");
        assertFalse(isValidUsername("am"), "Too short (less than 5 characters)");
        assertFalse(isValidUsername("A_really_long_username_exceeds"), "Too long (more than 15 characters)");
        assertFalse(isValidUsername("John-Doe"), "Contains invalid character '-'");
        assertFalse(isValidUsername("_underscoreStart"), "Cannot start with '_'");
        assertFalse(isValidUsername(" "), "Cannot contain spaces");
    }
}
