package annotations.repeatableannotation;

public class BugTracker {

    @BugReport(description = "Fix null pointer exception in login")
    @BugReport(description = "Optimize database query for better performance")
    public void resolveBugs() {
        System.out.println("Bugs resolved.");
    }
}