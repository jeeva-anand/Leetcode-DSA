
class Solution {

    public void postorderTraversal(TreeNode root, List<Integer> list){

        if( root == null) return;

        
        postorderTraversal(root.left,list);
        postorderTraversal(root.right,list);
        list.add(root.val);
        return;

    }
    
    public List<Integer> postorderTraversal(TreeNode root) {

        List<Integer> res = new ArrayList<>();
        postorderTraversal(root,res);
        return res;

    }
}