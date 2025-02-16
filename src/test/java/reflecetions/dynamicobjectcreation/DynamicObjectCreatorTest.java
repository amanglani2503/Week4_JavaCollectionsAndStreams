package reflecetions.dynamicobjectcreation;

import org.junit.jupiter.api.Test;
import java.lang.reflect.Constructor;
import java.lang.reflect.Method;
import static org.junit.jupiter.api.Assertions.*;

class DynamicObjectCreatorTest {

    @Test
    void testDynamicObjectCreation() throws Exception {
        Class<?> clazz = Class.forName("reflecetions.dynamicobjectcreation.Student");

        Constructor<?> constructor = clazz.getDeclaredConstructor();
        Object studentObject = constructor.newInstance();

        Method displayMethod = clazz.getMethod("displayInfo");
        assertNotNull(displayMethod);

        // Ensure the created object is an instance of Student
        assertTrue(studentObject instanceof Student);
    }
}
