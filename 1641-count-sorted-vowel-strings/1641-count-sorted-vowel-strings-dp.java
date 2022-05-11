class Solution {
    public int countVowelStrings(int n) {
        int [] dp = new int [6];
        
        dp[0] = 0;        
        for (int i=1; i<dp.length; i++)
            dp[i] = 1;
                
        for (int i=1; i<=n; i++) {
            for (int k=1; k<=5; k++) {
                dp[k] += dp[k-1];
            }
        }
        
        return dp[5];
    }
}
