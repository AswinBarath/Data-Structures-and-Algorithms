class Solution {
    public int coinChange(int[] coins, int amount) {
        int[] dp = new int[amount + 1];

		// Fill the dp with maximum number
		// As the answer cannot exceed amount, we take "amount + 1"
		Arrays.fill(dp, amount + 1);

		dp[0] = 0;
		for (int a = 1; a < dp.length; a++) {
			for (int c : coins) {
				if (a - c >= 0) {
					// Recurrence Relation
					dp[a] = Math.min(dp[a], 1 + dp[a - c]);
				}
			}
		}

		// Check for edge case - when we don't find the amount
		return dp[amount] == (amount + 1) ? -1 : dp[amount];
    }
}