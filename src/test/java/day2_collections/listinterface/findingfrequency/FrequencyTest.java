package day2_collections.listinterface.findingfrequency;

import org.junit.jupiter.api.Test;
import java.util.*;
import static org.junit.jupiter.api.Assertions.*;

class FrequencyTest {

    @Test
    void testFindFrequency() {
        List<String> list = Arrays.asList("apple", "banana", "orange", "apple", "cherry", "orange");
        Map<String, Integer> expected = new HashMap<>();
        expected.put("apple", 2);
        expected.put("banana", 1);
        expected.put("orange", 2);
        expected.put("cherry", 1);

        assertEquals(expected, Frequency.findFrequency(list));
    }

    @Test
    void testFindFrequencyWithEmptyList() {
        List<String> list = new ArrayList<>();
        Map<String, Integer> expected = new HashMap<>();

        assertEquals(expected, Frequency.findFrequency(list));
    }

    @Test
    void testFindFrequencyWithSingleElement() {
        List<String> list = Collections.singletonList("apple");
        Map<String, Integer> expected = new HashMap<>();
        expected.put("apple", 1);

        assertEquals(expected, Frequency.findFrequency(list));
    }

    @Test
    void testFindFrequencyWithAllSameElements() {
        List<String> list = Arrays.asList("banana", "banana", "banana");
        Map<String, Integer> expected = new HashMap<>();
        expected.put("banana", 3);

        assertEquals(expected, Frequency.findFrequency(list));
    }
}