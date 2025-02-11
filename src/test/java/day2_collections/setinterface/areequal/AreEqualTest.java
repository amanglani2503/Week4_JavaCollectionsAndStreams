package day2_collections.setinterface.areequal;

import org.junit.jupiter.api.Test;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;
import static org.junit.jupiter.api.Assertions.*;

class AreEqualTest {

    @Test
    void testAreEqualSameSets() {
        Set<Integer> set1 = new HashSet<>(Arrays.asList(1, 2, 3));
        Set<Integer> set2 = new HashSet<>(Arrays.asList(3, 2, 1));
        assertTrue(AreEqual.areEqual(set1, set2));
    }

    @Test
    void testAreEqualDifferentSetsExtraElement() {
        Set<Integer> set1 = new HashSet<>(Arrays.asList(1, 2, 3));
        Set<Integer> set2 = new HashSet<>(Arrays.asList(1, 2, 3, 4));
        assertFalse(AreEqual.areEqual(set1, set2));
    }

    @Test
    void testAreEqualCompletelyDifferentSets() {
        Set<String> set1 = new HashSet<>(Arrays.asList("apple", "banana"));
        Set<String> set2 = new HashSet<>(Arrays.asList("orange", "grape"));
        assertFalse(AreEqual.areEqual(set1, set2));
    }

    @Test
    void testAreEqualBothEmptySets() {
        Set<Double> set1 = new HashSet<>();
        Set<Double> set2 = new HashSet<>();
        assertTrue(AreEqual.areEqual(set1, set2));
    }

    @Test
    void testAreEqualOneEmptyOneNonEmpty() {
        Set<Character> set1 = new HashSet<>(Arrays.asList('A', 'B', 'C'));
        Set<Character> set2 = new HashSet<>();
        assertFalse(AreEqual.areEqual(set1, set2));
    }

    @Test
    void testAreEqualSetsWithDuplicates() {
        Set<Integer> set1 = new HashSet<>(Arrays.asList(1, 2, 2, 3, 3, 3));
        Set<Integer> set2 = new HashSet<>(Arrays.asList(3, 2, 1));
        assertTrue(AreEqual.areEqual(set1, set2));
    }
}
