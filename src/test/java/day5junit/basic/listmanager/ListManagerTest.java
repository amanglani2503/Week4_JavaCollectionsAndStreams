package day5junit.basic.listmanager;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;
import java.util.ArrayList;
import java.util.List;

class ListManagerTest {

    private final ListManager listManager = new ListManager();

    @Test
    void testAddElement() {
        List<Integer> list = new ArrayList<>();
        listManager.addElement(list, 10);
        listManager.addElement(list, 20);

        assertEquals(2, list.size());
        assertTrue(list.contains(10));
        assertTrue(list.contains(20));
    }

    @Test
    void testRemoveElement() {
        List<Integer> list = new ArrayList<>();
        listManager.addElement(list, 10);
        listManager.addElement(list, 20);
        listManager.removeElement(list, 10);

        assertEquals(1, list.size());
        assertFalse(list.contains(10));
        assertTrue(list.contains(20));
    }

    @Test
    void testGetSize() {
        List<Integer> list = new ArrayList<>();
        listManager.addElement(list, 10);
        listManager.addElement(list, 20);
        listManager.addElement(list, 30);

        assertEquals(3, listManager.getSize(list));

        listManager.removeElement(list, 20);
        assertEquals(2, listManager.getSize(list));
    }
}
