class Solution {
    public void inorderBST(TreeNode root, List<Integer> list){
        if(root==null) return;
        inorderBST(root.left,list);
        list.add(root.val);
        inorderBST(root.right,list);
    }
    public TreeNode buildBST(List<Integer> list, int low, int high){
        if(low> high) return null;
        int mid = low + (high-low)/2;
        TreeNode root = new TreeNode(list.get(mid));
        root.left = buildBST(list,low,mid-1);
        root.right = buildBST(list,mid+1,high);
        return root;
    }
    public TreeNode balanceBST(TreeNode root) {
        List<Integer> list = new ArrayList<>();
        inorderBST(root, list);
        return buildBST(list,0,list.size()-1);
    }
}