package annotations.cacheresult;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ComputationServiceTest {

    private ComputationService computationService;

    @BeforeEach
    void setUp() {
        computationService = new ComputationService();
    }

    @Test
    void testComputeFactorialWithoutCache() {
        int result = computationService.computeFactorial(5);
        assertEquals(120, result, "Factorial of 5 should be 120");
    }

    @Test
    void testComputeFactorialWithCache() {
        int firstCall = computationService.computeFactorial(5);
        int secondCall = computationService.computeFactorial(5);

        assertEquals(120, firstCall, "First call should compute factorial");
        assertEquals(120, secondCall, "Second call should retrieve from cache");
    }

    @Test
    void testComputeFactorialForDifferentNumbers() {
        int result5 = computationService.computeFactorial(5);
        int result6 = computationService.computeFactorial(6);

        assertEquals(120, result5, "Factorial of 5 should be 120");
        assertEquals(720, result6, "Factorial of 6 should be 720");
    }
}
