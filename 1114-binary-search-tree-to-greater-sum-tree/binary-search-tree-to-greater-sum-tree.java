class Solution {
    public int reverseInorder(TreeNode root, int greaterSum){
        if(root==null)return greaterSum;
        greaterSum = reverseInorder(root.right, greaterSum);
        root.val += greaterSum;
        greaterSum = root.val;
        return reverseInorder(root.left, greaterSum);

    }
    public TreeNode bstToGst(TreeNode root) {
        reverseInorder(root,0);
        return root;
    }
}