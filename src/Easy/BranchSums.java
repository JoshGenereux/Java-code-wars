package Easy;

import java.util.ArrayList;
import java.util.List;

public class BranchSums {

    public static List<Integer> branchSums(BinaryTree root){
        ArrayList<Integer> sums = new ArrayList<>();
        calculateSum(root, 0, sums);
        return sums;
    }

    public static void calculateSum(BinaryTree node, int runningSum, ArrayList<Integer> sums) {
        if (node == null) {
            return;
        }
        int newRunningSum = runningSum + node.value;
        if (node.left == null && node.right == null) {
            sums.add(newRunningSum);
        }
        calculateSum(node.left, runningSum, sums);
        calculateSum(node.right, runningSum, sums);
    }

    public static class BinaryTree {
        int value;
        BinaryTree left;
        BinaryTree right;

        BinaryTree(int value) {
            this.value = value;
            this.left = null;
            this.right = null;
        }
    }

}
