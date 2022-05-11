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
- Here we create an array call **dp**
- The dp array is filled with 1 except dp[0] which is filled as 0
- We take two loops: one for the number of elements *n* and another for the size of vowels *5*
- Then we keep track of the count of strings in each position till the end
- Finally the total count is stored in the last index of dp which **dp[5]**
-
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
if (n == 0) {
return 1;
}
int cnt = 0;
// Recursive case
for (int i = start; i < 5; i++)