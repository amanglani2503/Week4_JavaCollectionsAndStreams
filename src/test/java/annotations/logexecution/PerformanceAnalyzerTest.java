package annotations.logexecution;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
import java.io.ByteArrayOutputStream;
import java.io.PrintStream;
import java.lang.reflect.Method;

class PerformanceAnalyzerTest {

    @Test
    void testSlowMethodOutput() {
        PerformanceAnalyzer analyzer = new PerformanceAnalyzer();
        ByteArrayOutputStream outContent = new ByteArrayOutputStream();
        System.setOut(new PrintStream(outContent));

        analyzer.slowMethod();

        assertTrue(outContent.toString().contains("Slow method executed."));
    }

    @Test
    void testFastMethodOutput() {
        PerformanceAnalyzer analyzer = new PerformanceAnalyzer();
        ByteArrayOutputStream outContent = new ByteArrayOutputStream();
        System.setOut(new PrintStream(outContent));

        analyzer.fastMethod();

        assertEquals("Fast method executed." + System.lineSeparator(), outContent.toString());
    }

    @Test
    void testLogExecutionTimeAnnotations() throws NoSuchMethodException {
        Method slowMethod = PerformanceAnalyzer.class.getMethod("slowMethod");
        Method fastMethod = PerformanceAnalyzer.class.getMethod("fastMethod");

        assertTrue(slowMethod.isAnnotationPresent(LogExecutionTime.class));
        assertTrue(fastMethod.isAnnotationPresent(LogExecutionTime.class));
    }

    @Test
    void testExecutionWithTiming() throws Exception {
        PerformanceAnalyzer analyzer = new PerformanceAnalyzer();
        ByteArrayOutputStream outContent = new ByteArrayOutputStream();
        System.setOut(new PrintStream(outContent));

        PerformanceAnalyzer.executeWithTiming(analyzer, "fastMethod");

        assertTrue(outContent.toString().contains("Execution time for fastMethod:"));
    }
}
