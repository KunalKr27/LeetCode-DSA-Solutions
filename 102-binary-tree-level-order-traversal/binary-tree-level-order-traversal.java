class Solution {
    public int level(TreeNode root){
        if(root==null)return 0;
        return 1 + Math.max(level(root.left),level(root.right));
    }
    public void nthLevel(TreeNode root,int currLevel, int targetLevel, List<Integer> list){
        if(root==null)return;
        if(currLevel==targetLevel) list.add(root.val);
        nthLevel(root.left,currLevel+1,targetLevel,list);
        nthLevel(root.right,currLevel+1,targetLevel,list);
    }
    public List<List<Integer>> levelOrder(TreeNode root) {
        List<List<Integer>> res = new ArrayList<>();
        int lvl = level(root);
        for(int i=0;i<lvl;i++){
            List<Integer> list = new ArrayList<>();
            nthLevel(root,0,i,list);
            res.add(list);
        }
        return res;
    }
}