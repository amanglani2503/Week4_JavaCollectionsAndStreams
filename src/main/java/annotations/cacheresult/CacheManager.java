package annotations.cacheresult;

import java.lang.reflect.Method;

public class CacheManager {

    public static void executeWithCache(ComputationService service, int num) {
        try {
            Method method = ComputationService.class.getMethod("computeFactorial", int.class);
            if (method.isAnnotationPresent(CacheResult.class)) {
                int result = service.computeFactorial(num);
                System.out.println("Result: " + result);
            } else {
                System.out.println("Method is not cacheable.");
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public static void main(String[] args) {
        ComputationService service = new ComputationService();

        executeWithCache(service, 5); // Computation
        executeWithCache(service, 5); // Cached result
        executeWithCache(service, 6); // New computation
    }
}