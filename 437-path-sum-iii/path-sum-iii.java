class Solution {
    private int countPaths(TreeNode root, long target){
        if(root==null) return 0;
        int count = 0;
        if(root.val==target) count++;
        count += countPaths(root.left,target-root.val) + countPaths(root.right,target-root.val);
        return count;
    }
    public int pathSum(TreeNode root, int targetSum) {
        if(root==null) return 0;
        int count = countPaths(root,targetSum);
        count += pathSum(root.left,targetSum) + pathSum(root.right,targetSum);
        return count;
    }
}