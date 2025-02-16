package annotations.customannotation;

import java.lang.reflect.Method;

public class AnnotationProcessor {
    public static void main(String[] args) throws Exception {
        Method method = TaskManager.class.getMethod("completeTask");

        if (method.isAnnotationPresent(TaskInfo.class)) {
            TaskInfo annotation = method.getAnnotation(TaskInfo.class);
            System.out.println("Assigned To: " + annotation.assignedTo());
            System.out.println("Priority: " + annotation.priority());
        }
    }
}