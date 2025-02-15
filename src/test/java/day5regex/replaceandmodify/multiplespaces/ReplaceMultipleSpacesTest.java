package day5regex.replaceandmodify.multiplespaces;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class ReplaceMultipleSpacesTest {

    @Test
    void testReplaceMultipleSpaces_withExtraSpaces() {
        String text = "This  is   a   test.";
        String result = ReplaceMultipleSpaces.replaceMultipleSpaces(text);

        assertEquals("This is a test.", result);
    }

    @Test
    void testReplaceMultipleSpaces_withNoExtraSpaces() {
        String text = "This is fine.";
        String result = ReplaceMultipleSpaces.replaceMultipleSpaces(text);

        assertEquals("This is fine.", result);
    }

    @Test
    void testReplaceMultipleSpaces_withLeadingAndTrailingSpaces() {
        String text = "   Leading and trailing    spaces   .   ";
        String result = ReplaceMultipleSpaces.replaceMultipleSpaces(text);

        assertEquals(" Leading and trailing spaces . ", result);
    }

    @Test
    void testReplaceMultipleSpaces_withEmptyString() {
        String text = "";
        String result = ReplaceMultipleSpaces.replaceMultipleSpaces(text);

        assertEquals("", result);
    }

    @Test
    void testReplaceMultipleSpaces_withOnlySpaces() {
        String text = "      ";
        String result = ReplaceMultipleSpaces.replaceMultipleSpaces(text);

        assertEquals(" ", result);
    }
}
