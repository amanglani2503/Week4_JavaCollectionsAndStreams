package day5regex.advancedproblems.findrepeatingwords;

import org.junit.jupiter.api.Test;
import java.util.List;
import static org.junit.jupiter.api.Assertions.*;

class FindRepeatingWordsTest {

    @Test
    void testRepeatingWords_withRepeatingWords() {
        String text = "This is is a repeated repeated word test.";
        List<String> result = FindRepeatingWords.repeatingWords(text);

        assertEquals(List.of("is", "repeated"), result);
    }

    @Test
    void testRepeatingWords_withNoRepeatingWords() {
        String text = "This is a unique sentence with no repetition.";
        List<String> result = FindRepeatingWords.repeatingWords(text);

        assertTrue(result.isEmpty());
    }

    @Test
    void testRepeatingWords_withCaseDifference() {
        String text = "This is Is a test Test.";
        List<String> result = FindRepeatingWords.repeatingWords(text);

        assertTrue(result.isEmpty());
    }

    @Test
    void testRepeatingWords_withPunctuation() {
        String text = "Hello hello, world! This is is a test.";
        List<String> result = FindRepeatingWords.repeatingWords(text);

        assertEquals(List.of("is"), result);
    }

    @Test
    void testRepeatingWords_withEmptyString() {
        String text = "";
        List<String> result = FindRepeatingWords.repeatingWords(text);

        assertTrue(result.isEmpty());
    }
}
