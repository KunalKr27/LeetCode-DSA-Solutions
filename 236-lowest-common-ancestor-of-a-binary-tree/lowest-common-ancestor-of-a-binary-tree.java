class Solution {
    public boolean ifExists(TreeNode root, TreeNode node) {
        if (root == null) return false;             
        if (root == node) return true;              
        return ifExists(root.left, node) || ifExists(root.right, node);
    }

    public TreeNode lowestCommonAncestor(TreeNode root, TreeNode p, TreeNode q) {
        if (root == null) return null;               
        if (root == p || root == q) return root;     

        boolean pInLeft = ifExists(root.left, p);
        boolean qInLeft = ifExists(root.left, q);

        if (pInLeft && qInLeft) {
            return lowestCommonAncestor(root.left, p, q);
        }

        boolean pInRight = ifExists(root.right, p);
        boolean qInRight = ifExists(root.right, q);

        if (pInRight && qInRight) {
            return lowestCommonAncestor(root.right, p, q);
        }

        return root;
    }
}
