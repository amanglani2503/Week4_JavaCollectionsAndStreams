package annotations.logexecution;

import java.lang.reflect.Method;

public class PerformanceAnalyzer {

    @LogExecutionTime
    public void slowMethod() {
        try {
            Thread.sleep(2000); // Simulating delay
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println("Slow method executed.");
    }

    @LogExecutionTime
    public void fastMethod() {
        System.out.println("Fast method executed.");
    }

    public static void executeWithTiming(Object obj, String methodName) throws Exception {
        Method method = obj.getClass().getMethod(methodName);
        if (method.isAnnotationPresent(LogExecutionTime.class)) {
            long startTime = System.nanoTime();
            method.invoke(obj);
            long endTime = System.nanoTime();
            System.out.println("Execution time for " + methodName + ": " + (endTime - startTime) / 1_000_000 + " ms");
        }
    }

    public static void main(String[] args) throws Exception {
        PerformanceAnalyzer analyzer = new PerformanceAnalyzer();
        executeWithTiming(analyzer, "slowMethod");
        executeWithTiming(analyzer, "fastMethod");
    }
}