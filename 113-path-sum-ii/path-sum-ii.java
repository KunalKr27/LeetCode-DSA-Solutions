class Solution {
    public List<List<Integer>> pathSumHelper(TreeNode root, int target, List<Integer> path, List<List<Integer>> res){
        if(root==null)return res;
        List<Integer> newPath = new ArrayList<>(path);
        newPath.add(root.val);
        if(root.left==null && root.right==null && root.val==target){
            res.add(newPath);
        }
        pathSumHelper(root.left,target-root.val,newPath,res);
        pathSumHelper(root.right,target-root.val,newPath,res);
        return res;
    }

    public List<List<Integer>> pathSum(TreeNode root, int targetSum) {
        List<List<Integer>> res = new ArrayList<>();
        List<Integer> path = new ArrayList<>();
        return pathSumHelper(root,targetSum,path,res);
    }
}