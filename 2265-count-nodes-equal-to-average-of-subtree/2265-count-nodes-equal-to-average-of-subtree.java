class Solution {
    int ans = 0;
    public int averageOfSubtree(TreeNode root) {
        dfs(root);
        return ans;
    }
    
    private int[] dfs(TreeNode node) {
        if(node == null) {
            return new int[] {0,0};
        }
        
        int[] left = dfs(node.left);
        int[] right = dfs(node.right);
        
        int currSum = left[0] + right[0] + node.val;
        int currCount = left[1] + right[1] + 1;
        
        if(currSum / currCount == node.val) {
            ans++;
        }
            
        return new int[] {currSum, currCount};
    }
}