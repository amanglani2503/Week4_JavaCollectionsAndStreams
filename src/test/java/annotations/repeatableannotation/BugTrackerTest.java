package annotations.repeatableannotation;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
import java.io.ByteArrayOutputStream;
import java.io.PrintStream;
import java.lang.reflect.Method;

class BugTrackerTest {

    @Test
    void testResolveBugsOutput() {
        BugTracker bugTracker = new BugTracker();
        ByteArrayOutputStream outContent = new ByteArrayOutputStream();
        System.setOut(new PrintStream(outContent));

        bugTracker.resolveBugs();

        assertEquals("Bugs resolved." + System.lineSeparator(), outContent.toString());
    }

    @Test
    void testBugReportAnnotations() throws NoSuchMethodException {
        Method method = BugTracker.class.getMethod("resolveBugs");

        assertTrue(method.isAnnotationPresent(BugReports.class));

        BugReports bugReports = method.getAnnotation(BugReports.class);
        assertNotNull(bugReports);
        assertEquals(2, bugReports.value().length);
        assertEquals("Fix null pointer exception in login", bugReports.value()[0].description());
        assertEquals("Optimize database query for better performance", bugReports.value()[1].description());
    }
}
