class Solution {
    private TreeNode constructBST(int[] preorder, int[] inorder, int prelow, int prehigh, int inlow, int inhigh){
        if(prelow > prehigh || inlow > inhigh) return null;
        TreeNode root = new TreeNode(preorder[prelow]);
        int r = 0;
        while(inorder[r] != preorder[prelow]){
            r++;
        }
        int leftSize = r - inlow;
        root.left = constructBST(preorder, inorder, prelow+1, prelow+leftSize, inlow, r-1);
        root.right = constructBST(preorder, inorder, prelow+leftSize+1, prehigh, r+1, inhigh);
        return root;
    }
    public TreeNode bstFromPreorder(int[] preorder) {
        int n = preorder.length;
        int inorder[] = Arrays.copyOf(preorder,n);
        Arrays.sort(inorder);
        return constructBST(preorder, inorder, 0, n-1, 0, n-1);

    }
}