package annotations.cacheresult;

import java.util.HashMap;
import java.util.Map;

public class ComputationService {

    private static final Map<Integer, Integer> cache = new HashMap<>();

    @CacheResult
    public int computeFactorial(int num) {
        if (cache.containsKey(num)) {
            System.out.println("Fetching from cache: " + num);
            return cache.get(num);
        }

        System.out.println("Computing factorial for: " + num);
        int result = factorial(num);
        cache.put(num, result);
        return result;
    }

    private int factorial(int num) {
        return (num == 0) ? 1 : num * factorial(num - 1);
    }
}