# [63. Unique Paths II](https://leetcode.com/problems/unique-paths-ii/)
​
**Please 🔼 upvote this post if you find the answer useful & do comment about your thoughts 💬**
​
## Java | DP-Recursion | O(M x N)
​
### Better -> Dynamic Programming Approach
- We optimze the recursive approach by using memoization:
- to cache the overlapping subproblems
- to reuse the cache to avoid repeated recursive calls
- Time & Space Complexity: O(M x N)
- Runtime: 0 ms, faster than 100.00% of Java online submissions for Unique Paths.
​
#### Java Code
​
```
class Solution {
public int uniquePathsWithObstacles(int[][] obstacleGrid) {
int m = obstacleGrid.length;
int n = obstacleGrid[0].length;
int[][] dp = new int[m][n];
for (int[] row : dp)
Arrays.fill(row, -1);