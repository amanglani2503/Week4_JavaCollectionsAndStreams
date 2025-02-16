package reflecetions.classinformation;

import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.util.Scanner;

public class ClassInformationRetriever {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter class name: ");
        String className = scanner.nextLine();

        try {
            Class<?> clazz = Class.forName(className);

            System.out.println("Class Name: " + clazz.getName());

            System.out.println("\n--- Methods ---");
            for (Method method : clazz.getDeclaredMethods()) {
                System.out.println(method);
            }

            System.out.println("\n--- Fields ---");
            for (Field field : clazz.getDeclaredFields()) {
                System.out.println(field);
            }

            System.out.println("\n--- Constructors ---");
            for (Constructor<?> constructor : clazz.getDeclaredConstructors()) {
                System.out.println(constructor);
            }

        } catch (ClassNotFoundException e) {
            System.err.println("Class not found: " + e.getMessage());
        }

        scanner.close();
    }
}