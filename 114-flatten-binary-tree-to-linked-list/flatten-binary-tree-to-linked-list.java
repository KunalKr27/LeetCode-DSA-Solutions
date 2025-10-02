class Solution {
    private void helper(TreeNode root, List<TreeNode> list){
        if(root==null) return ;
        list.add(root);
        helper(root.left,list);
        helper(root.right,list);
    }
    public void flatten(TreeNode root) {
        List<TreeNode> list = new ArrayList<>();
        helper(root,list);
        for(int i= 0; i<list.size()-1;i++){
            list.get(i).left = null;
            list.get(i).right = list.get(i+1);
        }
    }
}