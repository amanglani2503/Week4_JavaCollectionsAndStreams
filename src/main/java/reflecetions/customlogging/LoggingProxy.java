package reflecetions.customlogging;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;

class LoggingProxy implements InvocationHandler {
    private final Object target;

    public LoggingProxy(Object target) {
        this.target = target;
    }

    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        System.out.println("Executing method: " + method.getName());
        return method.invoke(target, args);
    }
}
