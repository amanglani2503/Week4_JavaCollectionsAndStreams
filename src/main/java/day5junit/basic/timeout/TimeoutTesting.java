package day5junit.basic.timeout;

public class TimeoutTesting {
    public static String longRunningTask() {
        try {
            Thread.sleep(3000);
        } catch (InterruptedException e) {
            Thread.currentThread().interrupt();
        }
        return "Task Completed";
    }

    public static void main(String[] args) {
        System.out.println(longRunningTask());
    }
}
