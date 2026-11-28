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
        List<Integer> list = new ArrayList<>();
        int level = 0;
        recursion(root, level, list);
        return list;
    }

    public void recursion(TreeNode curr, int level, List<Integer> list){

        if(curr == null){
            return;
        }

        if(list.size() == level){
            list.add(curr.val);
        }
        recursion(curr.right, level+1, list);
        recursion(curr.left, level+1, list);
    }
}