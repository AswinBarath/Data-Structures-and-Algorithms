class Solution {
	int rLen = 0;
	int cLen = 0;
	// The four possible ways to move in a matrix
	int[][] dir = { { 0, 1 }, { 1, 0 }, { -1, 0 }, { 0, -1 } };

	public int longestIncreasingPath(int[][] matrix) {
		rLen = matrix.length;
		cLen = matrix[0].length;

		int max = 0;

		// To perform dfs at each cell
		int[][] dp = new int[rLen][cLen];
		for (int i = 0; i < rLen; i++) {
			for (int j = 0; j < cLen; j++) {
				int res = dfsOfLen(i, j, -1, matrix, dp);
				max = Math.max(max, res);
			}
		}
		return max;

	}

	public int dfsOfLen(int r, int c, int preVal, int[][] matrix, int[][] dp) {

		// Base cases
		if (r < 0 || c < 0 || r == rLen || c == cLen || matrix[r][c] <= preVal) {
			return 0;
		}
		if (dp[r][c] != 0) {
			return dp[r][c];
		}

		// Recursive cases
		int result = 1; // If no adjacent elements is greater than current element

		// Automate moves for four directions and find the maximum out of them
		for (int[] d : dir) {
			result = Math.max(result, 1 + dfsOfLen(r + d[0], c + d[1], matrix[r][c], matrix, dp));
		}

		dp[r][c] = result;

		return result;
	}
}