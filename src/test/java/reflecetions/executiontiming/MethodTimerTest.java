package reflecetions.executiontiming;

import org.junit.jupiter.api.Test;
import java.lang.reflect.Method;
import static org.junit.jupiter.api.Assertions.assertTrue;

class MethodTimerTest {

    @Test
    void testMethodExecutionTime() throws Exception {
        MathUtils mathUtils = new MathUtils();
        Method slowMethod = MathUtils.class.getDeclaredMethod("slowMethod");
        Method fastMethod = MathUtils.class.getDeclaredMethod("fastMethod");

        long slowStartTime = System.nanoTime();
        slowMethod.invoke(mathUtils);
        long slowEndTime = System.nanoTime();
        long slowDuration = (slowEndTime - slowStartTime) / 1_000_000; // Convert to ms

        long fastStartTime = System.nanoTime();
        fastMethod.invoke(mathUtils);
        long fastEndTime = System.nanoTime();
        long fastDuration = (fastEndTime - fastStartTime) / 1_000_000; // Convert to ms

        System.out.println("Slow Method Time: " + slowDuration + " ms");
        System.out.println("Fast Method Time: " + fastDuration + " ms");

        // Assert that slowMethod takes longer than fastMethod
        assertTrue(slowDuration > fastDuration, "slowMethod should take longer than fastMethod");

        // Assert reasonable execution time (within expected range)
        assertTrue(slowDuration >= 400 && slowDuration <= 600, "slowMethod should take ~500ms");
        assertTrue(fastDuration >= 50 && fastDuration <= 150, "fastMethod should take ~100ms");
    }
}