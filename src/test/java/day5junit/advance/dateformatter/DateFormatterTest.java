package day5junit.advance.dateformatter;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

class DateFormatterTest {

    @Test
    void testValidDate() {
        assertEquals("15-02-2025", DateFormatter.formatDate("2025-02-15"));
        assertEquals("30-07-2024", DateFormatter.formatDate("2024-07-30"));
    }

    @Test
    void testInvalidDate() {
        Exception exception = assertThrows(IllegalArgumentException.class, () -> DateFormatter.formatDate("invalid-date"));
        assertEquals("Invalid date format. Use yyyy-MM-dd.", exception.getMessage());
    }
}
