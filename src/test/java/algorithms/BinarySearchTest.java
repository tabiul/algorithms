package algorithms;

import org.junit.Test;

import static org.junit.Assert.*;

public class BinarySearchTest {

    @Test
    public void testSearch() {

        assertEquals(4, BinarySearch.search(new int[] {1, 2, 3, 4, 5}, 5));
        assertEquals(-1, BinarySearch.search(new int[] {1, 2, 3, 4, 5}, 0));
    }
}