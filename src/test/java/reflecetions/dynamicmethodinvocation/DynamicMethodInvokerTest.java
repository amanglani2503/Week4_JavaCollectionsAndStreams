package reflecetions.dynamicmethodinvocation;

import org.junit.jupiter.api.Test;
import java.lang.reflect.Method;
import static org.junit.jupiter.api.Assertions.*;

class DynamicMethodInvokerTest {

    @Test
    void testDynamicMethodInvocation() throws Exception {
        Class<?> clazz = Class.forName("reflecetions.dynamicmethodinvocation.MathOperations");
        Object obj = clazz.getDeclaredConstructor().newInstance();

        // Test "add" method
        Method addMethod = clazz.getMethod("add", int.class, int.class);
        int addResult = (int) addMethod.invoke(obj, 5, 3);
        assertEquals(8, addResult);

        // Test "subtract" method
        Method subtractMethod = clazz.getMethod("subtract", int.class, int.class);
        int subtractResult = (int) subtractMethod.invoke(obj, 10, 4);
        assertEquals(6, subtractResult);

        // Test "multiply" method
        Method multiplyMethod = clazz.getMethod("multiply", int.class, int.class);
        int multiplyResult = (int) multiplyMethod.invoke(obj, 6, 7);
        assertEquals(42, multiplyResult);
    }
}
