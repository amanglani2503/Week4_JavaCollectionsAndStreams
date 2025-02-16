package reflecetions.dynamicobjectcreation;

import java.lang.reflect.Method;

public class DynamicObjectCreator {
    public static void main(String[] args) {
        try {
            Class<?> clazz = Class.forName("reflecetions.dynamicobjectcreation.Student");

            Object studentObject = clazz.getDeclaredConstructor().newInstance();

            Method displayMethod = clazz.getMethod("displayInfo");
            displayMethod.invoke(studentObject);

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}