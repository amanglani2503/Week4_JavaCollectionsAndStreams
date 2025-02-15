package day5regex.extractionproblems.captitalizedwords;

import org.junit.jupiter.api.Test;
import java.util.List;
import static org.junit.jupiter.api.Assertions.*;

class CapitalizedWordsTest {

    @Test
    void testExtractCapitalizedWords_withValidCapitalizedWords() {
        String text = "The Eiffel Tower is in Paris and the Statue of Liberty is in New York.";
        List<String> capitalizedWords = CapitalizedWords.extractCapitalizedWords(text);

        assertEquals(8, capitalizedWords.size());
        assertEquals("The", capitalizedWords.get(0));
        assertEquals("Eiffel", capitalizedWords.get(1));
        assertEquals("Tower", capitalizedWords.get(2));
        assertEquals("Paris", capitalizedWords.get(3));
        assertEquals("Statue", capitalizedWords.get(4));
        assertEquals("Liberty", capitalizedWords.get(5));
    }

    @Test
    void testExtractCapitalizedWords_withNoCapitalizedWords() {
        String text = "this sentence has no capitalized words.";
        List<String> capitalizedWords = CapitalizedWords.extractCapitalizedWords(text);

        assertTrue(capitalizedWords.isEmpty());
    }

    @Test
    void testExtractCapitalizedWords_withMixedText() {
        String text = "NASA launched the Apollo mission.";
        List<String> capitalizedWords = CapitalizedWords.extractCapitalizedWords(text);

        assertEquals(2, capitalizedWords.size());
        assertEquals("NASA", capitalizedWords.get(0));
        assertEquals("Apollo", capitalizedWords.get(1));
    }

    @Test
    void testExtractCapitalizedWords_withSingleWord() {
        String text = "Moon";
        List<String> capitalizedWords = CapitalizedWords.extractCapitalizedWords(text);

        assertEquals(1, capitalizedWords.size());
        assertEquals("Moon", capitalizedWords.get(0));
    }

    @Test
    void testExtractCapitalizedWords_withEmptyString() {
        String text = "";
        List<String> capitalizedWords = CapitalizedWords.extractCapitalizedWords(text);

        assertTrue(capitalizedWords.isEmpty());
    }
}
