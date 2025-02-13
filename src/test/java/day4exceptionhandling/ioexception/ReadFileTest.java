package day4exceptionhandling.ioexception;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.io.TempDir;
import java.io.File;
import java.io.FileWriter;
import java.nio.file.Path;
import static org.junit.jupiter.api.Assertions.*;

class ReadFileTest {

    private final ReadFile readFile = new ReadFile();

    @Test
    void testReadFileSuccess(@TempDir Path tempDir) throws Exception {
        File tempFile = tempDir.resolve("testfile.txt").toFile();

        try (FileWriter writer = new FileWriter(tempFile)) {
            writer.write("This is a test file.");
        }

        assertDoesNotThrow(() -> readFile.readFile(tempFile.getAbsolutePath()));
    }

    @Test
    void testReadFileThrowsCustomIOException() {
        String invalidFilePath = "file_that_does_not_exist.txt";

        Exception exception = assertThrows(CustomIOException.class, () -> readFile.readFile(invalidFilePath));

        assertEquals("File not found !!", exception.getMessage());
    }
}
