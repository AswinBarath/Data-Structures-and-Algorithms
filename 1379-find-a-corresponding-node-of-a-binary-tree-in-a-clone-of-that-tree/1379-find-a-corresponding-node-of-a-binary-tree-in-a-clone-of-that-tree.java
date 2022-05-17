class Solution {
    TreeNode ans, target;

    public void inorder(TreeNode o, TreeNode c) {
        if (o != null) {
            
            inorder(o.left, c.left);
            
            // Save the answer globally
            if (o == target) {
                ans = c;
                return;
            }
            
            inorder(o.right, c.right);    
        }
    }

    public final TreeNode getTargetCopy(final TreeNode original, final TreeNode cloned, final TreeNode target) {
        
        // Save the target for global access
        this.target = target;
        
        inorder(original, cloned);
        
        return ans;
    }
}