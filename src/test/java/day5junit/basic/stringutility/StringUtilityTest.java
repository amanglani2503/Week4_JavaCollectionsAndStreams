package day5junit.basic.stringutility;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class StringUtilityTest {

    private final StringUtility stringUtils = new StringUtility();

    @Test
    void testReverse() {
        assertEquals("dcba", stringUtils.reverse("abcd"));
        assertEquals("racecar", stringUtils.reverse("racecar"));
        assertEquals("", stringUtils.reverse(""));
    }

    @Test
    void testIsPalindrome() {
        assertTrue(stringUtils.isPalindrome("racecar"));
        assertTrue(stringUtils.isPalindrome("Madam"));
        assertFalse(stringUtils.isPalindrome("hello"));
    }

    @Test
    void testToUpperCase() {
        assertEquals("HELLO", stringUtils.toUpperCase("hello"));
        assertEquals("WORLD", stringUtils.toUpperCase("world"));
        assertEquals("", stringUtils.toUpperCase(""));
    }
}
