package day2_collections.listinterface.rotateelement;

import org.junit.jupiter.api.Test;
import java.util.*;
import static org.junit.jupiter.api.Assertions.*;

class RotateListTest {

    @Test
    void testRotateListNormalCase() {
        List<Integer> list = Arrays.asList(10, 20, 30, 40, 50);
        List<Integer> expected = Arrays.asList(30, 40, 50, 10, 20);
        assertEquals(expected, RotateList.rotateList(list, 2));
    }

    @Test
    void testRotateListByZero() {
        List<Integer> list = Arrays.asList(1, 2, 3, 4, 5);
        assertEquals(list, RotateList.rotateList(list, 0));
    }

    @Test
    void testRotateListByListSize() {
        List<Integer> list = Arrays.asList(1, 2, 3, 4, 5);
        assertEquals(list, RotateList.rotateList(list, 5));
    }

    @Test
    void testRotateListMoreThanSize() {
        List<Integer> list = Arrays.asList(1, 2, 3, 4, 5);
        List<Integer> expected = Arrays.asList(4, 5, 1, 2, 3);
        assertEquals(expected, RotateList.rotateList(list, 8)); // 8 % 5 = 3
    }

    @Test
    void testRotateListEmptyList() {
        List<Integer> list = new ArrayList<>();
        assertTrue(RotateList.rotateList(list, 2).isEmpty());
    }

    @Test
    void testRotateListSingleElement() {
        List<Integer> list = Collections.singletonList(42);
        assertEquals(list, RotateList.rotateList(list, 3));
    }
}