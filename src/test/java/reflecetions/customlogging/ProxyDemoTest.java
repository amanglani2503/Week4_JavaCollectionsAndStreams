package reflecetions.customlogging;

import org.junit.jupiter.api.Test;
import java.lang.reflect.Proxy;
import static org.junit.jupiter.api.Assertions.assertDoesNotThrow;

public class ProxyDemoTest {

    @Test
    void testGreetingProxyInvocation() {
        Greeting greetingProxy = (Greeting) Proxy.newProxyInstance(
                Greeting.class.getClassLoader(),
                new Class[]{Greeting.class},
                new LoggingProxy(new GreetingImplementation())
        );

        // Ensure the method executes without throwing an exception
        assertDoesNotThrow(greetingProxy::sayHello);
    }
}
