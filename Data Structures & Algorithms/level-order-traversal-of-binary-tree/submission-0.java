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
    public List<List<Integer>> levelOrder(TreeNode root) {
        List<List<Integer>> res = new ArrayList<>();
        Queue<TreeNode> queue = new ArrayDeque<>();
        if(root ==null) return res;
        queue.add(root);
        while(queue.size()!=0)
        {
            int len=queue.size();
            List<Integer> level = new ArrayList<>();
            for(int i=0;i<len;i++)
            {
                TreeNode node = queue.remove();
                if(node!=null)
                {
                    level.add(node.val);
                    if(node.left!=null) queue.add(node.left);
                    if(node.right!=null) queue.add(node.right);
                }
            }
            res.add(new ArrayList<>(level));
        }
        return res;
    }
}
