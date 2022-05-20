# [62. Unique Paths](https://leetcode.com/problems/unique-paths/)
​
**Please 🔼 upvote this post if you find the answer useful & do comment about your thoughts 💬**
​
## Java | Brute-Better-Optimal | Math-DP-Recursion |
​
### Optimal -> Combinatorics / Math Approach
​
- From the problem we can observe in the matrix
- We can only make **m-1 Down** steps, where m is number of rows
- We can only make **n-1 Right** steps, where n is number of columns
- And, we can in total only make **m+n-2** steps
- Now, for an example: **m=2, n=3**
- The total possible steps are: **RRD**, **DRR**, & **RDR**, where R - right, D - down
- As you can see, we need to choose three combinations out of either **2 R's** or **1 D**
- So, the combination formula is 3C2 for **2 R's** and 3C1 for **1 D** and both will give the same answer
- Hence, from the observations we can take the maximum number among **m** & **n** given, to compute the easiest combination and return the answer
- Time Complexity: **O(M - 1)** or **O(N - 1)**
- Space Complexity: **O(1)**
- Runtime: 0 ms, faster than 100.00% of Java online submissions for Unique Paths.
​
#### Java Code
​
```
class Solution {
public int uniquePaths(int m, int n) {
int N = n + m - 2;
int r = (m-1) > (n-1) ? (n-1) : (m-1);
double res = 1;
for(int i=1; i <= r; i++) {
res = res * (N - r + i) / i;
}
return (int) res;
}
}
```
​
---
​
### Better -> Dynamic Programming Approach
​
- We optimze the recursive approach by using memoization:
- to cache the overlapping subproblems
- to reuse the cache to avoid repeated recursive calls