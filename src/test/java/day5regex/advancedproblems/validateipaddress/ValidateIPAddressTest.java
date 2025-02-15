package day5regex.advancedproblems.validateipaddress;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class ValidateIPAddressTest {

    @Test
    void testValidIP_withValidIPv4() {
        assertTrue(ValidateIPAddress.validIP("192.168.1.1"));
        assertTrue(ValidateIPAddress.validIP("255.255.255.255"));
        assertTrue(ValidateIPAddress.validIP("0.0.0.0"));
    }

    @Test
    void testValidIP_withInvalidIPv4() {
        assertFalse(ValidateIPAddress.validIP("256.256.256.256")); // Out of range
        assertFalse(ValidateIPAddress.validIP("192.168.1.256")); // Out of range
        assertFalse(ValidateIPAddress.validIP("192.168.1")); // Incomplete
        assertFalse(ValidateIPAddress.validIP("192.168.1.1.1")); // Too many sections
        assertFalse(ValidateIPAddress.validIP("192.168..1")); // Missing octet
        assertFalse(ValidateIPAddress.validIP("abc.def.ghi.jkl")); // Non-numeric values
    }

    @Test
    void testValidIP_withEmptyString() {
        assertFalse(ValidateIPAddress.validIP(""));
    }

    @Test
    void testValidIP_withNonNumericCharacters() {
        assertFalse(ValidateIPAddress.validIP("192.168.1.a"));
    }
}
