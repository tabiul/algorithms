package algorithms;

public class QuickFindArray {

    int[] nums = null;

    public QuickFindArray(int size) {
        nums = new int[size + 1];
        for (int i = 0; i < nums.length; i++) {
            nums[i] = i;
        }
    }

    public void union(int num1, int num2) {
        update(num2, nums[num1]);
    }

    public boolean connected(int num1, int num2) {
        return nums[num1] == nums[num2];
    }

    private void update(int index, int value) {
        if(nums[index] == index) {
            nums[index] = value;
        } else {
            update(nums[index], value);
            nums[index] = value;
        }
    }
}
