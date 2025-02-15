package day5regex.basicregexproblems.hexcolorcode;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
import java.util.regex.Pattern;

class HexColorCodeTest {

    // Hex color code regex pattern
    private static final String REGEX = "#[a-fA-F0-9]{6}";
    private static final Pattern pattern = Pattern.compile(REGEX);

    // Helper method to check if the hex color code is valid
    private boolean isValidHexColor(String code) {
        return pattern.matcher(code).matches();
    }

    @Test
    void testValidHexColors() {
        assertTrue(isValidHexColor("#FFA500"), "Valid hex color failed");
        assertTrue(isValidHexColor("#00FF00"), "Valid hex color failed");
        assertTrue(isValidHexColor("#A1B2C3"), "Valid hex color failed");
        assertTrue(isValidHexColor("#abcdef"), "Valid hex color failed");
        assertTrue(isValidHexColor("#123456"), "Valid hex color failed");
    }

    @Test
    void testInvalidHexColors() {
        assertFalse(isValidHexColor("FFA500"), "Missing '#' should be invalid");
        assertFalse(isValidHexColor("#GHIJKL"), "Contains invalid letters (G-L)");
        assertFalse(isValidHexColor("#12345"), "Less than 6 characters");
        assertFalse(isValidHexColor("#1234567"), "More than 6 characters");
        assertFalse(isValidHexColor("#12_456"), "Contains an invalid character ('_')");
        assertFalse(isValidHexColor("#12 456"), "Contains a space");
        assertFalse(isValidHexColor("#FFAA"), "Too short to be a valid hex color");
    }
}
