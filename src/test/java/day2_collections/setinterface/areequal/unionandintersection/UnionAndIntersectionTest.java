package day2_collections.setinterface.areequal.unionandintersection;

import org.junit.jupiter.api.Test;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;
import static org.junit.jupiter.api.Assertions.*;

class UnionAndIntersectionTest {

    @Test
    void testUnionWithCommonElements() {
        Set<String> set1 = new HashSet<>(Arrays.asList("A", "B", "C"));
        Set<String> set2 = new HashSet<>(Arrays.asList("B", "C", "D"));
        Set<String> expected = new HashSet<>(Arrays.asList("A", "B", "C", "D"));
        assertEquals(expected, UnionAndIntersection.union(set1, set2));
    }

    @Test
    void testUnionWithDisjointSets() {
        Set<Integer> set1 = new HashSet<>(Arrays.asList(1, 2, 3));
        Set<Integer> set2 = new HashSet<>(Arrays.asList(4, 5, 6));
        Set<Integer> expected = new HashSet<>(Arrays.asList(1, 2, 3, 4, 5, 6));
        assertEquals(expected, UnionAndIntersection.union(set1, set2));
    }

    @Test
    void testUnionWithOneEmptySet() {
        Set<Integer> set1 = new HashSet<>();
        Set<Integer> set2 = new HashSet<>(Arrays.asList(1, 2, 3));
        assertEquals(set2, UnionAndIntersection.union(set1, set2));
    }

    @Test
    void testUnionWithBothEmptySets() {
        Set<Double> set1 = new HashSet<>();
        Set<Double> set2 = new HashSet<>();
        assertTrue(UnionAndIntersection.union(set1, set2).isEmpty());
    }

    @Test
    void testIntersectionWithCommonElements() {
        Set<String> set1 = new HashSet<>(Arrays.asList("X", "Y", "Z"));
        Set<String> set2 = new HashSet<>(Arrays.asList("Y", "Z", "A"));
        Set<String> expected = new HashSet<>(Arrays.asList("Y", "Z"));
        assertEquals(expected, UnionAndIntersection.intersection(set1, set2));
    }

    @Test
    void testIntersectionWithDisjointSets() {
        Set<Integer> set1 = new HashSet<>(Arrays.asList(1, 2, 3));
        Set<Integer> set2 = new HashSet<>(Arrays.asList(4, 5, 6));
        assertTrue(UnionAndIntersection.intersection(set1, set2).isEmpty());
    }

    @Test
    void testIntersectionWithOneEmptySet() {
        Set<Character> set1 = new HashSet<>();
        Set<Character> set2 = new HashSet<>(Arrays.asList('A', 'B', 'C'));
        assertTrue(UnionAndIntersection.intersection(set1, set2).isEmpty());
    }

    @Test
    void testIntersectionWithBothEmptySets() {
        Set<Integer> set1 = new HashSet<>();
        Set<Integer> set2 = new HashSet<>();
        assertTrue(UnionAndIntersection.intersection(set1, set2).isEmpty());
    }
}
