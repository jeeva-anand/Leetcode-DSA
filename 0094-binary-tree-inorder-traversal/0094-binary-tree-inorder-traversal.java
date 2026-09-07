
class Solution {

    public List<Integer> inorderTraversal(TreeNode root) {
        
        List<Integer> res = new ArrayList<>();
        Stack<TreeNode> s = new Stack<>();

        if(root == null) return res;
            

        while(root != null || !s.isEmpty()){
            
            while(root != null) {
                s.push(root);
                root = root.left;
            }

            root = s.pop();
            res.add(root.val);

            root = root.right;
            
        }
        
        return res;

    }
}