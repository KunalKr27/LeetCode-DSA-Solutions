class Solution {
    public List<List<Integer>> zigzagLevelOrder(TreeNode root) {
        List<List<Integer>> res = new ArrayList<>();
        if(root==null)return res;
        Queue<TreeNode> q = new LinkedList<>();
        q.add(root);
        int currLevel = 1;
        while(q.size()>0){
        int levelSize = q.size();
        List<Integer> currList = new ArrayList<>();
        for(int i=0;i<levelSize;i++){
            TreeNode temp = q.remove();
            currList.add(temp.val);
            if(temp.left !=null) q.add(temp.left);
            if(temp.right !=null)q.add(temp.right);
        }
        if(currLevel %2 ==0)Collections.reverse(currList);
        res.add(currList);
        currLevel += 1;
        }
        return res;
    }
}