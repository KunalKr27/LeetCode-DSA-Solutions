class Solution {
    public int levels(TreeNode root){
        if(root==null)return 0;
        return 1 + Math.max(levels(root.left),levels(root.right));
    }
    public boolean isBalanced(TreeNode root) {
        if(root==null ||( root.left==null && root.right==null)) return true;
        int lst = levels(root.left);
        int rst = levels(root.right);
        if(Math.abs(lst-rst)>1)return false;
        return isBalanced(root.left) && isBalanced(root.right);
    }
}