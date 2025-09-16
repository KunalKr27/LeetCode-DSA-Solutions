class Solution {
    public TreeNode buildTreehelper(int[] inorder,int[] postorder, int postlow, int posthigh, int inlow, int inhigh){
        if(posthigh<postlow || inlow>inhigh) return  null;
        TreeNode root = new TreeNode(postorder[posthigh]);
        int r = inlow;
        while(inorder[r]!=postorder[posthigh]){
            r++;
        }
        int lst = r-inlow;
        root.left= buildTreehelper(inorder,postorder,postlow,postlow+lst-1,inlow,r-1);
        root.right= buildTreehelper(inorder,postorder,postlow+lst,posthigh-1,r+1,inhigh);
        return root;

    }
    public TreeNode buildTree(int[] inorder, int[] postorder) {
        int n = inorder.length;
        return buildTreehelper(inorder,postorder,0,n-1,0,n-1);
    }
}