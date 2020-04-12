package MySolution;

public abstract class DeleteLeavesWithAGivenValue {
}

class TreeNode {
    int val;
    TreeNode left;
    TreeNode right;
    TreeNode(int x) { val = x; }
}

class Solution {
    public TreeNode removeLeafNodes(TreeNode root, int target) {
        if (root == null) {
            return null;
        } else if (root.left == null && root.right == null && root.val == target) {
            return null;
        } else if (root.left == null && root.right == null && root.val != target) {
            return root;
        } else {
            root.left = removeLeafNodes(root.left, target);
            root.right = removeLeafNodes(root.right, target);
            if (root.left == null && root.right == null && root.val == target) {
                return null;
            } else {
                return root;
            }
        }
    }
}