package algorithms;

import org.junit.Test;

import java.util.Arrays;
import java.util.Random;

import static org.junit.Assert.*;

public class QuickTest {

    private Random random = new Random();

    @Test
    public void sort() {
        int iterations = 50;
        for (int i = 0; i < iterations; i++) {
            int[] nums = getRandomArray(20);
            System.out.println("input: " + Arrays.toString(nums));
            Quick.sort(nums);
            boolean isSorted = isSorted(nums);
            if (!isSorted) {
                fail("Not sorted, output : " + Arrays.toString(nums));

            }
        }
    }

    @Test
    public void select() {
        int[] nums = new int[] {5, 4, 3, 2, 1};
        assertEquals(-1, Quick.select(nums, -1));
        assertEquals(1, Quick.select(nums, 0));
        assertEquals(2, Quick.select(nums, 1));
        assertEquals(3, Quick.select(nums, 2));
        assertEquals(4, Quick.select(nums, 3));
        assertEquals(5, Quick.select(nums, 4));
        assertEquals(-1, Quick.select(nums, 5));
    }

    @Test
    public void myTest() {
        int[] nums = new int[]{37970992, 1220763688, -63332081, 1505478023, -9717789, 291485776, -936023643, 986481558, -111540468, 1208965002, 1637468933, -934996764, 1203274435, -1776104486, 409294564, 961765862, -1138525381, -928614671, -722180293, -177477217, 1729695523};
        Quick.sort(nums);
    }

    private int[] getRandomArray(int size) {
        int[] nums = new int[size + 1];

        for (int i = 0; i < nums.length; i++) {
            nums[i] = random.nextInt();
        }
        return nums;
    }

    private boolean isSorted(int[] nums) {
        for (int i = 0; i < nums.length - 1; i++) {
            if (nums[i + 1] < nums[i]) return false;
        }
        return true;
    }
}