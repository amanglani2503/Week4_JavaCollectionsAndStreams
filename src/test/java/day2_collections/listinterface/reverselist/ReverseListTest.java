package day2_collections.listinterface.reverselist;

import org.junit.jupiter.api.Test;
import java.util.*;
import static org.junit.jupiter.api.Assertions.*;

class ReverseListTest {

    @Test
    void testReverseArrayList() {
        List<Integer> list = new ArrayList<>(Arrays.asList(1, 2, 3, 4, 5));
        ReverseList.reverseList(list);
        assertEquals(Arrays.asList(5, 4, 3, 2, 1), list);
    }

    @Test
    void testReverseLinkedList() {
        List<Integer> list = new LinkedList<>(Arrays.asList(1, 2, 3, 4, 5));
        ReverseList.reverseList(list);
        assertEquals(Arrays.asList(5, 4, 3, 2, 1), list);
    }

    @Test
    void testReverseEmptyList() {
        List<Integer> list = new ArrayList<>();
        ReverseList.reverseList(list);
        assertTrue(list.isEmpty());
    }

    @Test
    void testReverseSingleElementList() {
        List<Integer> list = new ArrayList<>(Collections.singletonList(42));
        ReverseList.reverseList(list);
        assertEquals(Collections.singletonList(42), list);
    }

    @Test
    void testReverseListWithDuplicates() {
        List<Integer> list = new ArrayList<>(Arrays.asList(1, 2, 3, 2, 1));
        ReverseList.reverseList(list);
        assertEquals(Arrays.asList(1, 2, 3, 2, 1), list);
    }

    @Test
    void testReverseStringList() {
        List<String> list = new ArrayList<>(Arrays.asList("A", "B", "C", "D"));
        ReverseList.reverseList(list);
        assertEquals(Arrays.asList("D", "C", "B", "A"), list);
    }
}
