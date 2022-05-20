class Solution {
    public int uniquePathsWithObstacles(int[][] obstacleGrid) {
		int m = obstacleGrid.length;
		int n = obstacleGrid[0].length;
		int[][] dp = new int[m][n];
		for (int[] row : dp)
			Arrays.fill(row, -1);
		return countPathsDP(0, 0, m, n, obstacleGrid, dp);
	}

	public int countPathsDP(int i, int j, int m, int n, int[][] og, int[][] dp) {		
		// Base cases
		if (i >= m || j >= n)
			return 0;
		if (og[i][j] == 1)
			return 0;
		if (i == (m - 1) && j == (n - 1))
			return 1;

		// Memoization
		if (dp[i][j] != -1)
			return dp[i][j];

		// Recursive cases
		return dp[i][j] = countPathsDP(i + 1, j, m, n, og, dp) + countPathsDP(i, j + 1, m, n, og, dp);
	}
}