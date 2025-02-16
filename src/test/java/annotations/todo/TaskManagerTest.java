package annotations.todo;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
import java.io.ByteArrayOutputStream;
import java.io.PrintStream;
import java.lang.reflect.Method;

class TaskManagerTest {

    @Test
    void testUserAuthenticationOutput() {
        TaskManager taskManager = new TaskManager();
        ByteArrayOutputStream outContent = new ByteArrayOutputStream();
        System.setOut(new PrintStream(outContent));

        taskManager.userAuthentication();

        assertEquals("Pending: User Authentication" + System.lineSeparator(), outContent.toString());
    }

    @Test
    void testOptimizeDatabaseOutput() {
        TaskManager taskManager = new TaskManager();
        ByteArrayOutputStream outContent = new ByteArrayOutputStream();
        System.setOut(new PrintStream(outContent));

        taskManager.optimizeDatabase();

        assertEquals("Pending: Database Optimization" + System.lineSeparator(), outContent.toString());
    }

    @Test
    void testTodoAnnotations() throws NoSuchMethodException {
        Method authMethod = TaskManager.class.getMethod("userAuthentication");
        Method dbMethod = TaskManager.class.getMethod("optimizeDatabase");

        assertTrue(authMethod.isAnnotationPresent(Todo.class));
        assertTrue(dbMethod.isAnnotationPresent(Todo.class));

        Todo authAnnotation = authMethod.getAnnotation(Todo.class);
        Todo dbAnnotation = dbMethod.getAnnotation(Todo.class);

        assertEquals("Implement user authentication", authAnnotation.task());
        assertEquals("Alice", authAnnotation.assignedTo());
        assertEquals("HIGH", authAnnotation.priority());

        assertEquals("Optimize database queries", dbAnnotation.task());
        assertEquals("Bob", dbAnnotation.assignedTo());
        assertEquals("MEDIUM", dbAnnotation.priority());  // Default value
    }
}