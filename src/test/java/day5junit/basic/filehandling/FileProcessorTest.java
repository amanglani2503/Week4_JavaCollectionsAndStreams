package day5junit.basic.filehandling;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.*;

import java.io.File;
import java.io.IOException;

class FileProcessorTest {
    private static final String TEST_FILE = "testfile.txt";

    @BeforeEach
    void setUp() throws IOException {
        FileProcessor.writeToFile(TEST_FILE, "Hello, File Handling!");
    }

    @AfterEach
    void tearDown() {
        File file = new File(TEST_FILE);
        if (file.exists()) {
            file.delete();
        }
    }

    @Test
    void testWriteAndReadFile() throws IOException {
        String content = FileProcessor.readFromFile(TEST_FILE);
        assertEquals("Hello, File Handling!", content);
    }

    @Test
    void testFileExistsAfterWriting() {
        File file = new File(TEST_FILE);
        assertTrue(file.exists());
    }

    @Test
    void testReadNonExistentFileThrowsException() {
        File file = new File("nonexistent.txt");
        file.delete(); // Ensure the file does not exist
        assertThrows(IOException.class, () -> FileProcessor.readFromFile("nonexistent.txt"));
    }
}
