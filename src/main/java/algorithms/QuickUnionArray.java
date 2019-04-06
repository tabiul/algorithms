package algorithms;

public class QuickUnionArray {

    int[] nums = null;

    public QuickUnionArray(int size) {
        nums = new int[size + 1];
        for (int i = 0; i < nums.length; i++) {
            nums[i] = i;
        }
    }

    public void union(int num1, int num2) {
        nums[num1] = num2;
    }

    public boolean connected(int num1, int num2) {
        int root1 = findRoot(num1);
        int root2 = findRoot(num2);

        return root1 == root2;
    }

    private int findRoot(int num) {
        if (nums[num] == num) return num;
        else return findRoot(nums[num]);
    }

}
