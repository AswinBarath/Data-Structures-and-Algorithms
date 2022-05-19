if (r < 0 || c < 0 || r == rLen || c == cLen || matrix[r][c] <= preVal) {
return 0;
}
if (dp[r][c] != 0) {
return dp[r][c];
}
​
// Recursive cases
int result = 1; // If no adjacent elements is greater than current element
​
// Automate moves for four directions and find the maximum out of them
for (int[] d : dir) {
result = Math.max(result, 1 + dfsOfLen(r + d[0], c + d[1], matrix[r][c], matrix, dp));
}
​
dp[r][c] = result;
​
return result;
}
}
```
​
---
​
**Credits:**
- Solution video by NeetCode
- (Inspried from Logic, but it's translated to Java by myself)
- - https://www.youtube.com/watch?v=wCc_nd-GiEc