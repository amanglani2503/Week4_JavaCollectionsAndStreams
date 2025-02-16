package reflecetions.executiontiming;

import java.lang.reflect.Method;

public class MethodTimer {
    public static void main(String[] args) throws Exception {
        MathUtils mathUtils = new MathUtils();
        Method[] methods = MathUtils.class.getDeclaredMethods();

        for (Method method : methods) {
            long startTime = System.nanoTime();
            method.invoke(mathUtils);
            long endTime = System.nanoTime();
            System.out.println(method.getName() + " executed in " + (endTime - startTime) / 1_000_000 + " ms");
        }
    }
}