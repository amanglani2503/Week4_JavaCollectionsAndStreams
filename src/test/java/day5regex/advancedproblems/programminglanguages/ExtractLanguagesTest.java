package day5regex.advancedproblems.programminglanguages;

import org.junit.jupiter.api.Test;
import java.util.List;
import static org.junit.jupiter.api.Assertions.*;

class ExtractLanguagesTest {

    @Test
    void testExtractProgrammingLanguages_withMultipleMatches() {
        String text = "I love Java, Python, and JavaScript, but I haven't tried Go yet.";
        String[] languages = {"Java", "Go", "Python", "JavaScript", "Swift", "C", "C++"};
        List<String> result = ExtractLanguages.extractProgrammingLanguages(text, languages);

        assertEquals(List.of("Java", "Go", "Python", "JavaScript"), result);
    }

    @Test
    void testExtractProgrammingLanguages_withNoMatches() {
        String text = "I enjoy reading books and painting.";
        String[] languages = {"Java", "Go", "Python", "JavaScript"};
        List<String> result = ExtractLanguages.extractProgrammingLanguages(text, languages);

        assertTrue(result.isEmpty());
    }

    @Test
    void testExtractProgrammingLanguages_withPartialMatches() {
        String text = "I am learning JavaScript and Swift programming.";
        String[] languages = {"Java", "Go", "Python", "JavaScript", "Swift", "C", "C++"};
        List<String> result = ExtractLanguages.extractProgrammingLanguages(text, languages);

        assertEquals(List.of("JavaScript", "Swift"), result);
    }

    @Test
    void testExtractProgrammingLanguages_withEmptyText() {
        String text = "";
        String[] languages = {"Java", "Go", "Python", "JavaScript"};
        List<String> result = ExtractLanguages.extractProgrammingLanguages(text, languages);

        assertTrue(result.isEmpty());
    }
}
