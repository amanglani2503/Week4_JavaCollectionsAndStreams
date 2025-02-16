package reflecetions.invokeprivatemethod;

import java.lang.reflect.Method;

public class PrivateMethodInvoker {
    public static void main(String[] args) {
        try {
            Calculator calculator = new Calculator();
            Class<?> clazz = calculator.getClass();

            Method multiplyMethod = clazz.getDeclaredMethod("multiply", int.class, int.class);
            multiplyMethod.setAccessible(true); // Bypass private access

            int result = (int) multiplyMethod.invoke(calculator, 5, 10);
            System.out.println("Multiplication Result: " + result);

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}