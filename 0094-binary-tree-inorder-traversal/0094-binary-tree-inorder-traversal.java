
class Solution {

    public void inorderTraversal(TreeNode root, List<Integer> list){

        if( root == null) return;

        
        inorderTraversal(root.left,list);
        list.add(root.val);
        inorderTraversal(root.right,list);
        return;

    }

    public List<Integer> inorderTraversal(TreeNode root) {
        
        List<Integer> res = new ArrayList<>();
        inorderTraversal(root,res);
        return res;

    }
}