class Solution {
    int count;
    
    public void dfsInorder(TreeNode root) {
        if(root!=null){
            dfsInorder(root.left);
            count++;
            dfsInorder(root.right);
        }
    }
    
    public int countNodes(TreeNode root) {
        this.count = 0;
        dfsInorder(root);
        return count;
    }
}