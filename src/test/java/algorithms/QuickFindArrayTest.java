package algorithms;

import org.junit.Test;

import static org.junit.Assert.*;

public class QuickFindArrayTest {

    @Test
    public void testQuickUnionArray() {
        QuickFindArray quickFindArray = new QuickFindArray(10);
        quickFindArray.union(1, 10);
        assertTrue(quickFindArray.connected(1, 10));
        quickFindArray.union(10, 5);
        assertTrue(quickFindArray.connected(1, 5));
        assertTrue(quickFindArray.connected(10, 5));
        quickFindArray.union(5, 2);
        assertTrue(quickFindArray.connected(1, 2));
        assertTrue(quickFindArray.connected(2, 10));
        assertTrue(quickFindArray.connected(2, 5));
        assertFalse(quickFindArray.connected(2, 6));
    }

}