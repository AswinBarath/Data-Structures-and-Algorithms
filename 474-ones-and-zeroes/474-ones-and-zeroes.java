class Solution {
	int[][] dp;

	public int findMaxForm(String[] strs, int m, int n) {
		dp = new int[m + 1][n + 1];
		int consider = 0;
		int skip = 0;
		for (String s : strs) {
			int[] count = count(s);
			for (int zero = m; zero >= count[0]; zero--) {
				for (int one = n; one >= count[1]; one--) {
					consider = 1 + dp[zero - count[0]][one - count[1]];
					skip = dp[zero][one];
					dp[zero][one] = Math.max(consider, skip);
				}
			}
		}
		return dp[m][n];
	}

	public int[] count(String s) {
		int[] count = new int[2];
		for (char c : s.toCharArray()) {
			count[c - '0']++; // Count zeroes & ones
		}
		return count;
	}
}