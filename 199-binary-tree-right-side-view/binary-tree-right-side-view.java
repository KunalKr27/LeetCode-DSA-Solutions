class Solution {
    public List<Integer> rightSideView(TreeNode root) {
        List<Integer> res = new ArrayList<>();
        if(root==null)return res;
        if(root.left==null && root.right==null){
            res.add(root.val);
            return res;
        }
        Queue<TreeNode> q = new LinkedList<>();
        q.add(root);
        while(q.size()>0){
            int levelSize = q.size();
            for(int i=0;i<levelSize;i++){
                TreeNode temp = q.poll();
                if(i==levelSize-1) res.add(temp.val);
                if(temp.left!=null) q.add(temp.left);
                if(temp.right!=null) q.add(temp.right);
            }
        }
        return res;
    }
}