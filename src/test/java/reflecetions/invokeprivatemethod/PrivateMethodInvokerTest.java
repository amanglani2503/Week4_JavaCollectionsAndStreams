package reflecetions.invokeprivatemethod;

import org.junit.jupiter.api.Test;
import java.lang.reflect.Method;
import static org.junit.jupiter.api.Assertions.*;

class PrivateMethodInvokerTest {

    @Test
    void testPrivateMethodInvocation() throws Exception {
        Calculator calculator = new Calculator();
        Class<?> clazz = calculator.getClass();

        Method multiplyMethod = clazz.getDeclaredMethod("multiply", int.class, int.class);
        multiplyMethod.setAccessible(true);

        int result = (int) multiplyMethod.invoke(calculator, 5, 10);

        assertEquals(50, result);
    }
}
