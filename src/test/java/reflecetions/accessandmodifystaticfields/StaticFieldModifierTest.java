package reflecetions.accessandmodifystaticfields;

import org.junit.jupiter.api.Test;
import java.lang.reflect.Field;
import static org.junit.jupiter.api.Assertions.*;

class StaticFieldModifierTest {

    @Test
    void testStaticFieldModification() throws Exception {
        Class<?> clazz = Configuration.class;

        Field field = clazz.getDeclaredField("API_KEY");
        field.setAccessible(true);

        // Modify the static field
        field.set(null, "TEST_SECRET_KEY");

        // Verify modification
        assertEquals("TEST_SECRET_KEY", Configuration.getApiKey());
    }
}
