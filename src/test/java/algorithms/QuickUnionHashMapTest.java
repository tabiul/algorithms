package algorithms;

import org.junit.Test;

import static org.junit.Assert.*;

public class QuickUnionHashMapTest {

    @Test
    public void testQuickUnionHashMap() {
        QuickUnionHashMap<Integer> quickUnionHashMap = new QuickUnionHashMap<>();
        quickUnionHashMap.union(1, 10);
        assertTrue(quickUnionHashMap.connected(1, 10));
        quickUnionHashMap.union(10, 5);
        assertTrue(quickUnionHashMap.connected(1, 5));
        assertTrue(quickUnionHashMap.connected(10, 5));
        quickUnionHashMap.union(5, 2);
        assertTrue(quickUnionHashMap.connected(1, 2));
        assertTrue(quickUnionHashMap.connected(2, 10));
        assertTrue(quickUnionHashMap.connected(2, 5));
        assertFalse(quickUnionHashMap.connected(2, 6));
    }
}