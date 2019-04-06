package algorithms;

public class Quick {

    public static void sort(int[] nums) {
        sort(0, nums.length - 1, nums);
    }

    public static int select(int[] nums, int k) {
        if (k < 0 || k > nums.length - 1) return -1;
        int i = partition(0, nums.length - 1, nums);
        while (true) {
            if (i == k) return nums[i];
            if (k < i) {
                i = partition(0, i - 1, nums);
            } else {
                i = partition(i + 1, nums.length - 1, nums);
            }
        }
    }

    private static void sort(int start, int end, int[] nums) {
        if (start >= end) return;
        int p = partition(start, end, nums);
        sort(start, p - 1, nums);
        sort(p + 1, end, nums);
    }

    private static int partition(int start, int end, int[] nums) {
        int val = nums[start];
        int i = start + 1;
        int j = end;

        while (true) {
            while (i <= end) {
                if (nums[i] > val) {
                    break;
                }
                i++;
            }

            while (j >= start) {
                if (nums[j] <= val) {
                    break;
                }
                j--;
            }

            if (i >= j) break;

            //swap
            int temp = nums[i];
            nums[i] = nums[j];
            nums[j] = temp;
        }

        nums[start] = nums[j];
        nums[j] = val;

        return j;
    }
}
