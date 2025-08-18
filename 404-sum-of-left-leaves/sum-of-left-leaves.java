class Solution {
    // public int helper(TreeNode root, int sum){
    //     if(root==null)return 0;
    //     if((root.left==null && root.right==null)root.left!=null) sum += root.left.val;
    //     if(){
    //          sum += root.val;
    //     }
    //     return helper(root.left,sum) + helper(root.right,sum);
    // }
    public int bfs(TreeNode root, int sum){
        if(root==null)return sum;
        Queue<TreeNode> q = new LinkedList<>();
        q.add(root);
        while(q.size()>0){
            TreeNode temp = q.poll();
            if(temp.left!=null) {
                q.add(temp.left);
                if(temp.left.left==null && temp.left.right==null) sum+=temp.left.val;
            }
            if(temp.right!=null) q.add(temp.right);
        }
        return sum;
    }
    public int sumOfLeftLeaves(TreeNode root) {
        if(root==null) return 0;
        return bfs(root,0);
    }
}