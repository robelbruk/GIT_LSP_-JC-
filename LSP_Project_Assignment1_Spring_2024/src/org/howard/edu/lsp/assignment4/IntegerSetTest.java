package org.howard.edu.lsp.assignment4;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

public class IntegerSetTest {
    private IntegerSet set;

    @BeforeEach
    public void setup() {
        set = new IntegerSet();
    }

    @Test
    @DisplayName("Test adding elements and checking size")
    public void testAddAndLength() {
        set.add(1);
        set.add(2);
        assertEquals(2, set.length(), "Length should be 2 after adding two different elements.");
    }

    @Test
    @DisplayName("Test clear method")
    public void testClear() {
        set.add(1);
        set.clear();
        assertEquals(0, set.length(), "Length should be 0 after clearing the set.");
    }

    @Test
    @DisplayName("Test equals method")
    public void testEquals() {
        IntegerSet anotherSet = new IntegerSet();
        set.add(1);
        anotherSet.add(1);
        assertTrue(set.equals(anotherSet), "Sets with the same elements should be equal.");
    }

    @Test
    @DisplayName("Test contains method")
    public void testContains() {
        set.add(1);
        assertTrue(set.contains(1), "Set should contain the added element.");
        assertFalse(set.contains(2), "Set should not contain an element that was not added.");
    }

    @Test
    @DisplayName("Test largest method")
    public void testLargest() throws IntegerSetException {
        set.add(1);
        set.add(3);
        assertEquals(3, set.largest(), "Largest element should be returned.");
    }

    @Test
    @DisplayName("Test smallest method")
    public void testSmallest() throws IntegerSetException {
        set.add(2);
        set.add(1);
        assertEquals(1, set.smallest(), "Smallest element should be returned.");
    }

    @Test
    @DisplayName("Test remove method")
    public void testRemove() {
        set.add(1);
        set.remove(1);
        assertFalse(set.contains(1), "Set should not contain an element after it's removed.");
    }

    @Test
    @DisplayName("Test union method")
    public void testUnion() {
        IntegerSet anotherSet = new IntegerSet();
        set.add(1);
        anotherSet.add(2);
        set.union(anotherSet);
        assertTrue(set.contains(1) && set.contains(2), "Union should contain all elements from both sets.");
    }

    @Test
    @DisplayName("Test intersect method")
    public void testIntersect() {
        IntegerSet anotherSet = new IntegerSet();
        set.add(1);
        set.add(2);
        anotherSet.add(2);
        anotherSet.add(3);
        set.intersect(anotherSet);
        assertTrue(set.contains(2) && set.length() == 1, "Intersection should only contain elements present in both sets.");
    }

    @Test
    @DisplayName("Test difference method")
    public void testDiff() {
        IntegerSet anotherSet = new IntegerSet();
        set.add(1);
        set.add(2);
        anotherSet.add(2);
        anotherSet.add(3);
        set.diff(anotherSet);
        assertTrue(set.contains(1) && !set.contains(2), "Difference should only contain elements from the first set that are not in the second.");
    }

    @Test
    @DisplayName("Test complement method")
    public void testComplement() {
        IntegerSet anotherSet = new IntegerSet();
        set.add(1);
        set.add(2);
        anotherSet.add(1);
        set.complement(anotherSet);
        assertFalse(set.contains(1) && set.contains(2), "Complement should contain elements not in the second set.");
    }

    @Test
    @DisplayName("Test isEmpty method")
    public void testIsEmpty() {
        assertTrue(set.isEmpty(), "Newly created set should be empty.");
        set.add(1);
        assertFalse(set.isEmpty(), "Set should not be empty after adding an element.");
    }

    @Test
    @DisplayName("Test toString method")
    public void testToString() {
        set.add(1);
        set.add(2);
        String result = set.toString();
        assertTrue(result.contains("1") && result.contains("2"), "toString should contain all elements in the set.");
    }
}
