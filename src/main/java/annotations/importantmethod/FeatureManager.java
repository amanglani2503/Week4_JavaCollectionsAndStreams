package annotations.importantmethod;

public class FeatureManager {

    @ImportantMethod(level = 2)
    public void criticalFunction() {
        System.out.println("Executing a critical function.");
    }

    @ImportantMethod
    public void normalFunction() {
        System.out.println("Executing a normal function.");
    }
}