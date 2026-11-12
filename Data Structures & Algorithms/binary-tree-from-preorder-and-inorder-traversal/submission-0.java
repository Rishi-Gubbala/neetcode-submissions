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
    private int pre = 0, in = 0;

    public TreeNode buildTree(int[] preorder, int[] inorder) {
        return build(preorder, inorder, Integer.MAX_VALUE); // sentinel, not a valid value
    }

    private TreeNode build(int[] preorder, int[] inorder, int stop) {
        if (pre >= preorder.length) return null;

        if (inorder[in] == stop) {   // this subtree is finished
            in++;
            return null;
        }

        TreeNode root = new TreeNode(preorder[pre++]);
        root.left = build(preorder, inorder, root.val);  // left ends when we reach root
        root.right = build(preorder, inorder, stop);     // right ends where the parent's range ends
        return root;
    }
}
