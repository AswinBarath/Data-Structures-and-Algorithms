​
## Dynamic Programming Solution
​
### Java Code
​
```
class Solution {
public int countVowelStrings(int n) {
// create a dp array of size 6
int [] dp = new int [6];
// dp[0] must be 0 and the rest 1
for (int i=1; i<dp.length; i++)
dp[i] = 1;
for (int i=1; i<=n; i++) {
for (int k=1; k<=5; k++) {
dp[k] += dp[k-1];
}
}
return dp[5];
}
}
```
​
### Explanation
​
- a
- b
​
**Time Complexity:** O(N) <- O(N x 5)
**Space Complexity:** O(1)
​
## Recursive Solution
​
### Java Code
​
```
class Solution {
public int countVowelStrings(int n) {
return countstrings(n,0);
}
public int countstrings(int n, int start)
{
// Base case