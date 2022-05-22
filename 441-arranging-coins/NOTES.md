# [441. Arranging Coins](https://leetcode.com/problems/arranging-coins/)
​
**Please 🔼 upvote this post if you find the answer useful & do comment about your thoughts 💬**
​
##  Java | 3 Solutions | Math | Binary Search | Linear 🔥
​
### Java Solution - Math
​
```
​
```
​
---
​
​
### Java Solution - Binary Search
​
```
​
```
​
---
​
​
### Java Solution - Linear algorithm
​
- We need **n** coins for nth step:
- so we can keep decrementing the given number **num**
- while we increment the step & result for each iteration
- if **num** becomes zero, we can return result
- if **num** becomes negative, it means current step is incomplete. So we need decrement result and return result
- Time Complexity: **O(N)**
- Space Complexity: **O(1)**
​
```
class Solution {
public int arrangeCoins(int num) {
// TODO Determine no. of coins required to arrange complete staircase using
// linear algo
int result = 0;
int step = 1;
while (num >= 0) {
num -= step;
step++;
result++;
if (num < 0) {
// When step is incomplete - num will become negative
result--;
}
}
return result;
}
}
```
​
---
​
**Credits:**
- Solution video by NeetCode - https://www.youtube.com/watch?v=5rHz_6s2Buw
- LeetCode Solution - https://leetcode.com/problems/arranging-coins/solution/