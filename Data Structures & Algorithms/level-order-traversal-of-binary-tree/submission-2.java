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
    public static void bfs(Queue<TreeNode> queue, List<List<Integer>> res)
    {
        if(queue.isEmpty()) return;
        int len = queue.size();
        List<Integer> level = new ArrayList<>();
        for(int i=0;i<len;i++)
        {
            TreeNode node = queue.remove();
            level.add(node.val);
            if(node.left!=null) queue.add(node.left);
            if(node.right!=null) queue.add(node.right);
        }
        res.add(level);
        bfs(queue,res);
    }
    public List<List<Integer>> levelOrder(TreeNode root) {
        List<List<Integer>> res = new ArrayList<>();
        Queue<TreeNode> queue = new ArrayDeque<>();
        if(root==null) return res;
        queue.add(root);
        bfs(queue,res);
        return res;
    }
}
