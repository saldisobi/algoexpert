package easy;

import java.util.Stack;

/**
 * Definition for a binary tree node.
 * public class TreeNode {
 * int val;
 * TreeNode left;
 * TreeNode right;
 * TreeNode() {}
 * TreeNode(int val) { this.val = val; }
 * TreeNode(int val, TreeNode left, TreeNode right) {
 * this.val = val;
 * this.left = left;
 * this.right = right;
 * }
 * }
 */
class BinaryTreeMaxHeight {
    public int maxDepth(TreeNode root) {

        if (root == null) return 0;
        Stack<TreeNode> stack = new Stack();

        Stack<Integer> stackLevel = new Stack();

        stack.add(root);
        stackLevel.add(1);

        int maxDepth = 0;

        while (!stack.isEmpty()) {
            TreeNode currentNode = stack.pop();

            int currentHeight = stackLevel.pop();

            if (currentNode.left == null && currentNode.right == null && (currentHeight > maxDepth)) {
                maxDepth = currentHeight;
            }

            if (currentNode.left != null) {
                stack.add(currentNode.left);
                stackLevel.add(currentHeight + 1);
            }
            if (currentNode.right != null) {
                stack.add(currentNode.right);
                stackLevel.add(currentHeight + 1);
            }
        }

        return maxDepth;


    }
}