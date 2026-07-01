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
    static int ans = -1, c;
    public int kthSmallest(TreeNode root, int k) {
        c = k;
        helper(root, k);
        return ans;
    }
    static void helper(TreeNode root, int k){
        if(root != null){
            helper(root.left, k);
            c--;
            if(c == 0){
            ans = root.val;
            }
            helper(root.right, k);
        }
    }
}
