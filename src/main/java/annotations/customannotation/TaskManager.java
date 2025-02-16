package annotations.customannotation;

public class TaskManager {

    @TaskInfo(assignedTo = "John Doe", priority = 1)
    public void completeTask() {
        System.out.println("Task completed!");
    }
}