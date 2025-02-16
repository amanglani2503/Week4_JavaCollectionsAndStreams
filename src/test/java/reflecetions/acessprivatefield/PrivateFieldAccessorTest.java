package reflecetions.acessprivatefield;

import org.junit.jupiter.api.Test;
import java.lang.reflect.Field;
import static org.junit.jupiter.api.Assertions.*;

class PrivateFieldAccessorTest {

    @Test
    void testPrivateFieldAccess() throws NoSuchFieldException, IllegalAccessException {
        Person person = new Person(25);
        Class<?> clazz = person.getClass();

        Field ageField = clazz.getDeclaredField("age");
        ageField.setAccessible(true);

        // Test original age value
        assertEquals(25, ageField.get(person));

        // Modify the private field
        ageField.set(person, 30);

        // Test modified age value
        assertEquals(30, ageField.get(person));
    }
}