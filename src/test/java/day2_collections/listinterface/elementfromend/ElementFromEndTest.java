package day2_collections.listinterface.elementfromend;

import org.junit.jupiter.api.Test;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;
import static org.junit.jupiter.api.Assertions.*;

class ElementFromEndTest {

    @Test
    void testElementFromEndNormalCase() {
        List<Character> list = new LinkedList<>(Arrays.asList('A', 'B', 'C', 'D', 'E'));
        assertEquals('D', ElementFromEnd.elementFromEnd(list, 2));
    }

    @Test
    void testElementFromEndFirstElement() {
        List<Integer> list = new LinkedList<>(Arrays.asList(1, 2, 3, 4, 5, 6));
        assertEquals(6, ElementFromEnd.elementFromEnd(list, 1));
    }

    @Test
    void testElementFromEndLastElement() {
        List<Integer> list = new LinkedList<>(Arrays.asList(10, 20, 30, 40));
        assertEquals(10, ElementFromEnd.elementFromEnd(list, 4));
    }

    @Test
    void testElementFromEndNGreaterThanSize() {
        List<String> list = new LinkedList<>(Arrays.asList("one", "two", "three"));
        assertThrows(IllegalArgumentException.class, () -> ElementFromEnd.elementFromEnd(list, 5));
    }

    @Test
    void testElementFromEndEmptyList() {
        List<Double> list = new LinkedList<>();
        assertThrows(IllegalArgumentException.class, () -> ElementFromEnd.elementFromEnd(list, 2));
    }

    @Test
    void testElementFromEndSingleElementList() {
        List<Character> list = new LinkedList<>(List.of('X'));
        assertEquals('X', ElementFromEnd.elementFromEnd(list, 1));
    }
}
