package annotations.importantmethod;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
import java.io.ByteArrayOutputStream;
import java.io.PrintStream;
import java.lang.reflect.Method;

class FeatureManagerTest {

    @Test
    void testCriticalFunctionOutput() {
        FeatureManager manager = new FeatureManager();
        ByteArrayOutputStream outContent = new ByteArrayOutputStream();
        System.setOut(new PrintStream(outContent));

        manager.criticalFunction();

        assertEquals("Executing a critical function." + System.lineSeparator(), outContent.toString());
    }

    @Test
    void testNormalFunctionOutput() {
        FeatureManager manager = new FeatureManager();
        ByteArrayOutputStream outContent = new ByteArrayOutputStream();
        System.setOut(new PrintStream(outContent));

        manager.normalFunction();

        assertEquals("Executing a normal function." + System.lineSeparator(), outContent.toString());
    }

    @Test
    void testImportantMethodAnnotations() throws NoSuchMethodException {
        Method criticalMethod = FeatureManager.class.getMethod("criticalFunction");
        Method normalMethod = FeatureManager.class.getMethod("normalFunction");

        assertTrue(criticalMethod.isAnnotationPresent(ImportantMethod.class));
        assertTrue(normalMethod.isAnnotationPresent(ImportantMethod.class));

        ImportantMethod criticalAnnotation = criticalMethod.getAnnotation(ImportantMethod.class);
        ImportantMethod normalAnnotation = normalMethod.getAnnotation(ImportantMethod.class);

        assertEquals(2, criticalAnnotation.level());  // Custom level
        assertEquals(1, normalAnnotation.level());    // Default level
    }
}