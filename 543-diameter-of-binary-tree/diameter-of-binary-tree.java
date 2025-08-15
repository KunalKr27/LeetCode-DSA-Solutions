class Solution {
    public int levels(TreeNode root){
        if(root==null)return 0;
        return 1 + Math.max(levels(root.left),levels(root.right));
    }
    public int diameterOfBinaryTree(TreeNode root) {
        if(root==null || (root.left ==null && root.right == null))return 0;
        int currDia = levels(root.left)+levels(root.right);
        int leftDia = diameterOfBinaryTree(root.left);
        int rightDia = diameterOfBinaryTree(root.right);
        return Math.max(currDia,Math.max(leftDia,rightDia));
    }
}