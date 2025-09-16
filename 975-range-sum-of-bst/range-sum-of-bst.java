class Solution {
    public int helper(TreeNode root, int low, int high, int sum){
        if(root==null)return sum;
        if(root.val>=low && root.val<=high){
            sum +=root.val;
        }
        if(root.val<low){
            return helper(root.right,low,high,sum);
        }else if(root.val>high){
            return helper(root.left,low,high,sum);
        }
        sum = helper(root.right,low,high,sum);
        sum = helper(root.left,low,high,sum);
        return sum;
    }
    public int rangeSumBST(TreeNode root, int low, int high) {
        if(root==null)return 0;
        return helper(root,low,high,0);
    }
}