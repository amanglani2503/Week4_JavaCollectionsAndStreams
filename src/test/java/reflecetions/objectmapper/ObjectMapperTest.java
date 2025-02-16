package reflecetions.objectmapper;

import org.junit.jupiter.api.Test;
import java.lang.reflect.Field;
import java.util.HashMap;
import java.util.Map;
import static org.junit.jupiter.api.Assertions.*;

class ObjectMapperTest {

    @Test
    void testObjectMapping() throws Exception {
        Map<String, Object> data = new HashMap<>();
        data.put("name", "John Doe");
        data.put("age", 25);

        Person person = ObjectMapper.toObject(Person.class, data);

        // Use reflection to verify field values
        Class<?> clazz = person.getClass();

        // Check name field
        Field nameField = clazz.getDeclaredField("name");
        nameField.setAccessible(true);
        assertEquals("John Doe", nameField.get(person));

        // Check age field
        Field ageField = clazz.getDeclaredField("age");
        ageField.setAccessible(true);
        assertEquals(25, ageField.get(person));
    }
}
