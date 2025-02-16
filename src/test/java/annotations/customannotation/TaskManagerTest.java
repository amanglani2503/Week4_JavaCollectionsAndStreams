package annotations.customannotation;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
import java.io.ByteArrayOutputStream;
import java.io.PrintStream;
import java.lang.reflect.Method;

class TaskManagerTest {

    @Test
    void testCompleteTaskOutput() {
        TaskManager taskManager = new TaskManager();
        ByteArrayOutputStream outContent = new ByteArrayOutputStream();
        System.setOut(new PrintStream(outContent));

        taskManager.completeTask();

        assertEquals("Task completed!" + System.lineSeparator(), outContent.toString());
    }

    @Test
    void testTaskInfoAnnotation() throws NoSuchMethodException {
        Method method = TaskManager.class.getMethod("completeTask");

        assertTrue(method.isAnnotationPresent(TaskInfo.class));

        TaskInfo annotation = method.getAnnotation(TaskInfo.class);
        assertEquals("John Doe", annotation.assignedTo());
        assertEquals(1, annotation.priority());
    }
}
