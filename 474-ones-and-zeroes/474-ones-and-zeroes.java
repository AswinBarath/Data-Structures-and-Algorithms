class Solution {
    int[][][] dp;

	public int findMaxForm(String[] strs, int m, int n) {
		dp = new int[m + 1][n + 1][strs.length];
		return helper(strs, m, n, 0);
	}

	public int helper(String[] strs, int zero, int one, int index) {
		if (index == strs.length || zero + one == 0) {
			return 0;
		}

		if (dp[zero][one][index] > 0) {
			return dp[zero][one][index];
		}

		int[] count = count(strs[index]);

		// consider - changes to zeros and ones
		int consider = 0;

		if (zero >= count[0] && one >= count[1]) {
			consider = 1 + helper(strs, zero - count[0], one - count[1], index + 1);
		}

		// skip - changes to zeros and ones
		int skip = helper(strs, zero, one, index + 1);

		// Memoization
		dp[zero][one][index] = Math.max(consider, skip);
		
		return dp[zero][one][index];
	}

	public int[] count(String s) {
		int[] count = new int[2];
		for (char c : s.toCharArray()) {
			count[c - '0']++; // Count zeroes & ones
		}
		return count;
	}
}