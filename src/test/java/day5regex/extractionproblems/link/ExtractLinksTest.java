package day5regex.extractionproblems.link;

import org.junit.jupiter.api.Test;
import java.util.List;
import static org.junit.jupiter.api.Assertions.*;

class ExtractLinksTest {

    @Test
    void testExtractLinks_withValidLinks() {
        String text = "Visit https://www.google.com and https://example.org for more info.";
        List<String> links = ExtractLinks.extractLinks(text);

        assertEquals(2, links.size());
        assertEquals("https://www.google.com", links.get(0));
        assertEquals("https://example.org", links.get(1));
    }

    @Test
    void testExtractLinks_withNoLinks() {
        String text = "There are no links in this text.";
        List<String> links = ExtractLinks.extractLinks(text);

        assertTrue(links.isEmpty());
    }

    @Test
    void testExtractLinks_withMixedText() {
        String text = "Check this site: https://openai.com but not this: http://example.com";
        List<String> links = ExtractLinks.extractLinks(text);

        assertEquals(1, links.size());
        assertEquals("https://openai.com", links.get(0));
    }

    @Test
    void testExtractLinks_withEmptyString() {
        String text = "";
        List<String> links = ExtractLinks.extractLinks(text);

        assertTrue(links.isEmpty());
    }
}
