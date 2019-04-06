package algorithms;

import org.junit.Test;

import static org.junit.Assert.*;

public class QuickUnionArrayTest {

    @Test
    public void testQuickUnionArray() {
        QuickUnionArray quickUnionArray = new QuickUnionArray(10);
        quickUnionArray.union(1, 10);
        assertTrue(quickUnionArray.connected(1, 10));
        quickUnionArray.union(10, 5);
        assertTrue(quickUnionArray.connected(1, 5));
        assertTrue(quickUnionArray.connected(10, 5));
        quickUnionArray.union(5, 2);
        assertTrue(quickUnionArray.connected(1, 2));
        assertTrue(quickUnionArray.connected(2, 10));
        assertTrue(quickUnionArray.connected(2, 5));
        assertFalse(quickUnionArray.connected(2, 6));
    }

}