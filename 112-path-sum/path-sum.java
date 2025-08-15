class Solution {
    public boolean sum(TreeNode root, int runningSum, int targetSum){
        if(root==null) return false;
        runningSum += root.val;
        if(root.left ==null && root.right==null){
           return runningSum == targetSum;
        }
        return sum(root.left,runningSum,targetSum) || sum(root.right,runningSum,targetSum);
    }

    public boolean hasPathSum(TreeNode root, int targetSum) {
        if(root==null)return false;
        return sum(root,0,targetSum);
    }
}