package day5regex.replaceandmodify.censorbadwords;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class CensorBadWordsTest {

    @Test
    void testCensorBadWords_withBadWords() {
        String text = "This is a damn bad example with some stupid words.";
        String[] badWords = {"damn", "stupid"};
        String result = CensorBadWords.censorBadWords(text, badWords);

        assertEquals("This is a **** bad example with some **** words.", result);
    }

    @Test
    void testCensorBadWords_withNoBadWords() {
        String text = "This is a clean sentence.";
        String[] badWords = {"damn", "stupid"};
        String result = CensorBadWords.censorBadWords(text, badWords);

        assertEquals("This is a clean sentence.", result);
    }

    @Test
    void testCensorBadWords_withPartialMatches() {
        String text = "This is a damning statement with stupidity.";
        String[] badWords = {"damn", "stupid"};
        String result = CensorBadWords.censorBadWords(text, badWords);

        assertEquals("This is a damning statement with stupidity.", result);
    }

    @Test
    void testCensorBadWords_withEmptyString() {
        String text = "";
        String[] badWords = {"damn", "stupid"};
        String result = CensorBadWords.censorBadWords(text, badWords);

        assertEquals("", result);
    }

    @Test
    void testCensorBadWords_withOnlyBadWords() {
        String text = "damn stupid";
        String[] badWords = {"damn", "stupid"};
        String result = CensorBadWords.censorBadWords(text, badWords);

        assertEquals("**** ****", result);
    }
}
