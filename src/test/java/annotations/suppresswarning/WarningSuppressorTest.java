package annotations.suppresswarning;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

class WarningSuppressorTest {

    @Test
    void testUseRawList() {
        WarningSuppressor suppressor = new WarningSuppressor();
        ByteArrayOutputStream outContent = new ByteArrayOutputStream();
        System.setOut(new PrintStream(outContent));

        suppressor.useRawList();

        assertEquals("Unchecked warning suppressed" + System.lineSeparator(), outContent.toString());
    }
}
