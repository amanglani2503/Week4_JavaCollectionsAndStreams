package reflecetions.customlogging;

import java.lang.reflect.Proxy;

public class ProxyDemo {
    public static void main(String[] args) {
        Greeting greeting = (Greeting) Proxy.newProxyInstance(
                Greeting.class.getClassLoader(),
                new Class[]{Greeting.class},
                new LoggingProxy(new GreetingImplementation())
        );

        greeting.sayHello();
    }
}