package day2_collections.listinterface.removeduplicates;

import org.junit.jupiter.api.Test;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import static org.junit.jupiter.api.Assertions.*;

class RemoveDuplicatesTest {

    @Test
    void testRemoveDuplicatesNormalCase() {
        List<Integer> list = Arrays.asList(3, 1, 2, 3, 2, 1, 4, 5, 3);
        List<Integer> expected = Arrays.asList(3, 1, 2, 4, 5);
        assertEquals(expected, RemoveDuplicates.removeDuplicates(list));
    }

    @Test
    void testRemoveDuplicatesNoDuplicates() {
        List<Integer> list = Arrays.asList(10, 20, 30, 40, 50);
        assertEquals(list, RemoveDuplicates.removeDuplicates(list));
    }

    @Test
    void testRemoveDuplicatesEmptyList() {
        List<Integer> list = Collections.emptyList();
        assertEquals(Collections.emptyList(), RemoveDuplicates.removeDuplicates(list));
    }

    @Test
    void testRemoveDuplicatesSingleElement() {
        List<Integer> list = Collections.singletonList(42);
        assertEquals(list, RemoveDuplicates.removeDuplicates(list));
    }

    @Test
    void testRemoveDuplicatesAllSameElements() {
        List<String> list = Arrays.asList("hello", "hello", "hello");
        List<String> expected = Collections.singletonList("hello");
        assertEquals(expected, RemoveDuplicates.removeDuplicates(list));
    }

    @Test
    void testRemoveDuplicatesWithDifferentDataTypes() {
        List<Character> list = Arrays.asList('a', 'b', 'a', 'c', 'b', 'd');
        List<Character> expected = Arrays.asList('a', 'b', 'c', 'd');
        assertEquals(expected, RemoveDuplicates.removeDuplicates(list));
    }
}
