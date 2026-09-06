
class Solution {


    public void preOrder(TreeNode root, List<Integer> list){

        if( root == null) return;

        list.add(root.val);
        preOrder(root.left,list);
        preOrder(root.right,list);
        return;

    }

    public List<Integer> preorderTraversal(TreeNode root) {
        
        List<Integer> res = new ArrayList<>();
        preOrder(root,res);
        return res;
    }
}