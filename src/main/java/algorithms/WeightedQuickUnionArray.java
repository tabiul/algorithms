package algorithms;

// https://www.youtube.com/watch?v=sEo6LlPxpHE
public class WeightedQuickUnionArray {

    int[] nums = null;
    int[] sizes = null;

    public WeightedQuickUnionArray(int size) {
        nums = new int[size + 1];
        sizes = new int[size + 1];
        for (int i = 0; i < nums.length; i++) {
            nums[i] = i;
            sizes[i] = 1;
        }
    }

    public void union(int num1, int num2) {

        // in order to ensure that finding the root is fast this time
        // we keep track of number of children of each tree and then add the smaller tree size
        // to the bigger tree size so that the path to the root is balanced.

        int root1 = findRoot(num1);
        int root2 = findRoot(num2);

        if (sizes[root1] > sizes[root2]) {
            nums[root2] = root1;
            sizes[root1] = sizes[root1] + sizes[root2];
        } else {
            nums[root1] = root2;
            sizes[root2] = sizes[root1] + sizes[root2];
        }
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
