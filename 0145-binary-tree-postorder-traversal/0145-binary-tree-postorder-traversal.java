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
    public List<Integer> postorderTraversal(TreeNode root) {
        
        
        
        List<Integer> res = new ArrayList<>();
        Stack<TreeNode> s = new Stack<>();

        if(root == null) return res;
        
        while(root != null || !s.isEmpty()){
            while(root != null) {
                s.push(root);
                res.add(root.val);
                root = root.right;
            }

            root = s.pop();
            
            root = root.left;
        }
        
        Collections.reverse(res);
        return res;

    }
}