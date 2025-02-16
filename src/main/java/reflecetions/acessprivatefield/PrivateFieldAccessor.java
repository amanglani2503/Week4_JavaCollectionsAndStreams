package reflecetions.acessprivatefield;

import java.lang.reflect.Field;

public class PrivateFieldAccessor {
    public static void main(String[] args) {
        try {
            Person person = new Person(25);
            Class<?> clazz = person.getClass();

            Field ageField = clazz.getDeclaredField("age");
            ageField.setAccessible(true); // Bypass private access

            System.out.println("Original Age: " + ageField.get(person));

            ageField.set(person, 30);
            System.out.println("Modified Age: " + ageField.get(person));

        } catch (NoSuchFieldException | IllegalAccessException e) {
            e.printStackTrace();
        }
    }
}