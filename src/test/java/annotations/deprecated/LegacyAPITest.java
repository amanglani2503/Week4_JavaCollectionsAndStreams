package annotations.deprecated;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

class LegacyAPITest {

    @Test
    @SuppressWarnings("deprecation")  // Suppress warning for testing deprecated method
    void testOldFeature() {
        LegacyAPI api = new LegacyAPI();
        ByteArrayOutputStream outContent = new ByteArrayOutputStream();
        System.setOut(new PrintStream(outContent));

        api.oldFeature();

        assertEquals("This is an old feature and should not be used." + System.lineSeparator(), outContent.toString());
    }

    @Test
    void testNewFeature() {
        LegacyAPI api = new LegacyAPI();
        ByteArrayOutputStream outContent = new ByteArrayOutputStream();
        System.setOut(new PrintStream(outContent));

        api.newFeature();

        assertEquals("This is the new recommended feature." + System.lineSeparator(), outContent.toString());
    }
}
