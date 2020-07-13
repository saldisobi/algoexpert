package easy;


import java.util.Stack;

class TreeNode {
    int val;
    TreeNode left;
    TreeNode right;

    TreeNode() {
    }

    TreeNode(int val) {
        this.val = val;
    }

    TreeNode(int val, TreeNode left, TreeNode right) {
        this.val = val;
        this.left = left;
        this.right = right;
    }
}

/**
 * 112. Path Sum
 * Easy
 * Given a binary tree and a sum, determine if the tree has a root-to-leaf path such that adding up all the values along the path equals the given sum.
 * <p>
 * Note: A leaf is a node with no children.
 * <p>
 * Example:
 * <p>
 * Given the below binary tree and sum = 22,
 * <p>
 * 5
 * / \
 * 4   8
 * /   / \
 * 11  13  4
 * /  \      \
 * 7    2      1
 * return true, as there exist a root-to-leaf path 5->4->11->2 which sum is 22.
 */
class BranchSum {
    public boolean hasPathSum(TreeNode root, int sum) {

        if (root == null)
            return false;

        Stack<TreeNode> stack = new Stack();
        Stack<Integer> stackSum = new Stack();


        stack.add(root);

        stackSum.add(sum - root.val);

        while (!stack.isEmpty()) {

            TreeNode currentNode = stack.pop();

            int currentSum = stackSum.pop();

            if (currentNode.left == null && currentNode.right == null && currentSum == 0) {
                return true;
            }

            if (currentNode.left != null) {
                stack.add(currentNode.left);
                stackSum.add(currentSum - currentNode.left.val);
            }
            if (currentNode.right != null) {
                stack.add(currentNode.right);
                stackSum.add(currentSum - currentNode.right.val);
            }
        }

        return false;

    }
}