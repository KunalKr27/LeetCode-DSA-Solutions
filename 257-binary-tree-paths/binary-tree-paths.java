class Solution {
    public void pathTraversal(TreeNode root, String path, List<String> list){
        if(root==null) return;
        if(root.left==null && root.right==null){
            list.add(path + root.val);
        }
        pathTraversal(root.left, path+root.val+"->", list);
        pathTraversal(root.right, path+root.val+"->", list);
    }
    public List<String> binaryTreePaths(TreeNode root) {
        List<String> list = new ArrayList<>();
        if(root == null) return list;
        pathTraversal(root,"", list);
        return list;
    }
}