
class Solution {


   

    public List<Integer> preorderTraversal(TreeNode root) {
        
        

        List<Integer> res = new ArrayList<>();
        Stack<TreeNode> s = new Stack<>();

        if(root == null) return res;
        s.push(root);
        while(!s.isEmpty()){
            TreeNode top = s.pop();
            res.add(top.val);
            if(top.right != null ) s.push(top.right);
            if(top.left != null) s.push(top.left);
        }
        
        return res;


    }
}