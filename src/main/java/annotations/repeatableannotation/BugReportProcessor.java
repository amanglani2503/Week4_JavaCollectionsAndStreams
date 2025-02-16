package annotations.repeatableannotation;

import java.lang.reflect.Method;

public class BugReportProcessor {
    public static void main(String[] args) throws Exception {
        Method method = BugTracker.class.getMethod("resolveBugs");

        if (method.isAnnotationPresent(BugReports.class)) {
            BugReports bugReports = method.getAnnotation(BugReports.class);
            for (BugReport bugReport : bugReports.value()) {
                System.out.println("Bug Description: " + bugReport.description());
            }
        }
    }
}