package day5regex.extractionproblems.date;

import org.junit.jupiter.api.Test;
import java.util.List;
import static org.junit.jupiter.api.Assertions.*;

class ExtractDatesTest {

    @Test
    void testExtractDates_withValidDates() {
        String text = "The events are scheduled for 12/05/2023, 15/08/2024, and 29/02/2020.";
        List<String> dates = ExtractDates.extractDates(text);

        assertEquals(3, dates.size());
        assertEquals("12/05/2023", dates.get(0));
        assertEquals("15/08/2024", dates.get(1));
        assertEquals("29/02/2020", dates.get(2));
    }

    @Test
    void testExtractDates_withNoDates() {
        String text = "There are no dates in this sentence.";
        List<String> dates = ExtractDates.extractDates(text);

        assertTrue(dates.isEmpty());
    }

    @Test
    void testExtractDates_withMixedText() {
        String text = "Today's date is 01/01/2022, but 2023/12/31 is not valid.";
        List<String> dates = ExtractDates.extractDates(text);

        assertEquals(1, dates.size());
        assertEquals("01/01/2022", dates.get(0));
    }


    @Test
    void testExtractDates_withEmptyString() {
        String text = "";
        List<String> dates = ExtractDates.extractDates(text);

        assertTrue(dates.isEmpty());
    }
}
