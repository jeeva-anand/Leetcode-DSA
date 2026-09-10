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
    public List<List<Integer>> levelOrderBottom(TreeNode root) {
        
         Queue<TreeNode> q = new ArrayDeque<>();
        ArrayList<List<Integer>> res = new ArrayList<>();
        Stack< List<Integer>> s = new Stack<>();

        if(root == null) return res;

        q.add(root);

        while(!q.isEmpty()){

            int size = q.size();
            List<Integer> temp = new ArrayList<>();
            
            while(size-- > 0 ){

                
                TreeNode peek = q.remove();

                temp.add(peek.val);
                

                if(peek.left != null) q.add(peek.left);
                if(peek.right != null) q.add(peek.right);

            }

            s.push(temp);
            
        }

        while(!s.isEmpty()){
            res.add(s.pop());
        }

        return res;
    }
}