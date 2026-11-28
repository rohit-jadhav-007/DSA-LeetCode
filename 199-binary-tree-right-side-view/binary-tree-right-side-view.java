/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode() {}
 *     TreeNode(int val) { this.val = val; }
 *     TreeNode(int val, TreeNode left, TreeNode right) {
 *         this.val = val;
 *         this.left = left;
 *         this.right = right;
 *     }
 * }
 */
class Solution {
    public List<Integer> rightSideView(TreeNode root) {

        List<Integer> result = new ArrayList<>();

        recursion(root, 0, result);

        return result;
    }

    public void recursion(TreeNode root, int level, List<Integer> res) {

        if (root == null) {
            return;
        }

        // If this is the first node visited at this level
        if (res.size() == level) {
            res.add(root.val);
        }

        // Traverse right child first
        recursion(root.right, level + 1, res);

        // Then traverse left child
        recursion(root.left, level + 1, res);
    }
}