package day4exceptionhandling.trywithresources;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.StandardOpenOption;

public class FileReadTest {

    @Test
    void testValidFile() throws Exception {
        Path tempFile = Files.createTempFile("testFile", ".txt");
        Files.writeString(tempFile, "Hello, world!", StandardOpenOption.WRITE);

        assertDoesNotThrow(() -> FileRead.readFile(tempFile.toString()));

        Files.deleteIfExists(tempFile);
    }

    @Test
    void testFileNotFound() {
        Exception exception = assertThrows(CustomIOException.class,
                () -> FileRead.readFile("non_existent_file.txt"));
        assertEquals("Error reading file !!", exception.getMessage());
    }
}
