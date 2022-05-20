#### Java Code
​
```
class Solution {
public int uniquePathsWithObstacles(int[][] obstacleGrid) {
int m = obstacleGrid.length;
int n = obstacleGrid[0].length;
return countPaths(0, 0, m, n, obstacleGrid);
}
​
public int countPaths(int i, int j, int m, int n, int[][] obstacleGrid) {
// Base cases
if (i >= m || j >= n)
return 0;
if (obstacleGrid[i][j] == 1)
return 0;
if (i == (m - 1) && j == (n - 1))
return 1;
​
// Recursive cases
return countPaths(i + 1, j, m, n, obstacleGrid) + countPaths(i, j + 1, m, n, obstacleGrid);
}
}
```
​
---
​
Also Check out **Unique Paths I** problem's solution over here: https://leetcode.com/problems/unique-paths/discuss/2056773/Java-or-Brute-Better-Optimal-or-Math-DP-Recursion