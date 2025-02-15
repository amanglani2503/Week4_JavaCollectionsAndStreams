package day5junit.basic.timeout;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Timeout;

import static org.junit.jupiter.api.Assertions.*;

class TimeoutTestingTest {

    @Test
    @Timeout(2) // Fail if execution time exceeds 2 seconds
    void testLongRunningTask() {
        String result = TimeoutTesting.longRunningTask();
        assertEquals("Task Completed", result);
    }
}