class Solution {
    public void helper(TreeNode root, List<Integer> inorderBST){
        if(root==null)return;
        helper(root.left,inorderBST);
        inorderBST.add(root.val);
        helper(root.right,inorderBST);
    }
    public boolean isValidBST(TreeNode root) {
        List<Integer> inorderBST = new ArrayList<>();
        helper(root,inorderBST);
        for(int i=0;i<inorderBST.size()-1;i++){
            if(inorderBST.get(i)>=inorderBST.get(i+1)) return false;
        }
        return true;
    }
}