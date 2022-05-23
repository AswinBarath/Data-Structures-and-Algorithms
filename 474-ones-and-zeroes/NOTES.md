# [474. Ones and Zeroes](https://leetcode.com/problems/ones-and-zeroes/)
​
**Please 🔼 upvote this post if you find the answer useful & do comment about your thoughts 💬**
​
## ✅ Java | 3 Solutions | Bottom-Up DP | Top-Down DP | Recursion 🔥
​
---
​
### Java Solution -> Bottom-Up DP
​
- Space Optimization is applied on the memoization of subproblems
​
```
class Solution {
int[][] dp;
​
public int findMaxForm(String[] strs, int m, int n) {
dp = new int[m + 1][n + 1];
int consider = 0;