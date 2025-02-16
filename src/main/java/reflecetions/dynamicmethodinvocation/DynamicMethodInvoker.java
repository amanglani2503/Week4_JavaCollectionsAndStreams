package reflecetions.dynamicmethodinvocation;

import java.lang.reflect.Method;
import java.util.Scanner;

public class DynamicMethodInvoker {
    public static void main(String[] args) {
        try {
            Class<?> clazz = Class.forName("reflecetions.dynamicmethodinvocation.MathOperations");
            Object obj = clazz.getDeclaredConstructor().newInstance();

            Scanner scanner = new Scanner(System.in);
            System.out.print("Enter method name (add, subtract, multiply): ");
            String methodName = scanner.nextLine();

            Method method = clazz.getMethod(methodName, int.class, int.class);

            System.out.print("Enter first number: ");
            int num1 = scanner.nextInt();
            System.out.print("Enter second number: ");
            int num2 = scanner.nextInt();

            Object result = method.invoke(obj, num1, num2);
            System.out.println("Result: " + result);

            scanner.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
