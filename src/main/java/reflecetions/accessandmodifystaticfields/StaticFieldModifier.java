package reflecetions.accessandmodifystaticfields;

import java.lang.reflect.Field;

public class StaticFieldModifier {
    public static void main(String[] args) {
        try {
            Class<?> clazz = Class.forName("reflecetions.accessandmodifystaticfields.Configuration");

            Field field = clazz.getDeclaredField("API_KEY");

            field.setAccessible(true); // Allow modification of private field
            field.set(null, "NEW_SECRET_KEY");

            System.out.println("Modified API_KEY: " + Configuration.getApiKey());
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}