class Solution {
    public void helper(TreeNode root, List<Integer> list){
        if(root==null)return;
        if(root.left==null && root.right==null){
            list.add(root.val);
        }
        helper(root.left,list);
        helper(root.right,list);
    }
    public boolean leafSimilar(TreeNode root1, TreeNode root2) {
        List<Integer> r1 = new ArrayList<>();
        List<Integer> r2 = new ArrayList<>();

        helper(root1,r1);
        helper(root2,r2);

        return r1.equals(r2);

    }
}