package reflecetions.executiontiming;

public class MathUtils {
    public void slowMethod() {
        try { Thread.sleep(500); } catch (InterruptedException e) {}
    }

    public void fastMethod() {
        try { Thread.sleep(100); } catch (InterruptedException e) {}
    }
}