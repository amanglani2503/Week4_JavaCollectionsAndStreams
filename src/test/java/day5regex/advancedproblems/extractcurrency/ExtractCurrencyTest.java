package day5regex.advancedproblems.extractcurrency;

import org.junit.jupiter.api.Test;
import java.util.List;
import static org.junit.jupiter.api.Assertions.*;

class ExtractCurrencyTest {

    @Test
    void testExtractCurrency_withValidCurrencyValues() {
        String text = "The price is $45.99, and the discount is 10.50.";
        List<String> result = ExtractCurrency.extractCurrency(text);

        assertEquals(List.of("45.99", "10.50"), result);
    }

    @Test
    void testExtractCurrency_withMultipleCurrencies() {
        String text = "Items cost 5.00, 99.99, and 1234.56 dollars.";
        List<String> result = ExtractCurrency.extractCurrency(text);

        assertEquals(List.of("5.00", "99.99", "1234.56"), result);
    }

    @Test
    void testExtractCurrency_withNoCurrencyValues() {
        String text = "There is no price mentioned here.";
        List<String> result = ExtractCurrency.extractCurrency(text);

        assertTrue(result.isEmpty());
    }

    @Test
    void testExtractCurrency_withInvalidFormats() {
        String text = "Prices like 45,99 or 100 are not in correct format.";
        List<String> result = ExtractCurrency.extractCurrency(text);

        assertTrue(result.isEmpty());
    }

    @Test
    void testExtractCurrency_withEmptyString() {
        String text = "";
        List<String> result = ExtractCurrency.extractCurrency(text);

        assertTrue(result.isEmpty());
    }
}