# [62. Unique Paths](https://leetcode.com/problems/unique-paths/)
​
****
​
## Java | 3 Solutions | Brute-Better-Optimal
​
### Optimal -> Math Approach
​
#### Java Code
​
```
​
```
​
---
​
### Better -> Dynamic Programming Approach
​
#### Java Code
​
```
​
```
​
---
​
### Brute-force -> Recursive Approach
​
- **Note**: This solution will provide TLE error for larger testcases
​
#### Java Code
​
```
class Solution {
public int uniquePaths(int m, int n) {
return countPaths(0, 0, m, n);
}
​
public int countPaths(int i, int j, int m, int n) {
// Base cases
if (i == (m - 1) && j == (n - 1))
return 1;
if (i >= m && j >= n)
return 0;
​
// Recursive cases
return countPaths(i + 1, j, m, n) + countPaths(i, j + 1, m, n);
}
}