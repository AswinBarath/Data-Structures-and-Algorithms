# [441. Arranging Coins](https://leetcode.com/problems/arranging-coins/)
​
**Please 🔼 upvote this post if you find the answer useful & do comment about your thoughts 💬**
​
##  Java | 3 Solutions | Math | Binary Search | Linear 🔥
​
### Java Solution - Math
​
- We can find the total number coins required at **nth** step using Guass's formula
- Guass's formula: **n x (n + 1) / 2**, which is the sum of n numbers
- This way we can solve the formula such that:
- let the total number of steps (answer) be **k**
- **k x (k + 1) / 2** <= **n**
- Then the equation for **k** become like this:
- **k = sqrt( 2 * n + ( 1 / 4 ) ) - ( 1 / 2 )**
- Hence, we can return the answer computed using above formala
- Time complexity : **O(1)**
- Space complexity : **O(1)**
​
```
class Solution {
public int arrangeCoins(int num) {
int k = (int)(Math.sqrt(2 * (long)num + 0.25) - 0.5);
return k;
}
}
```
​
---
​
​
### Java Solution - Binary Search
​
- If we observe the problem carefully at **ith** step, the number of coins required is the sum of **i** steps: ***1 + ... + (i-1) + i***
- We can find the total number coins required at **ith** step using Guass's formula
- Guass's formula: **n x (n + 1) / 2**, which is the sum of n numbers
- So, we use this to check the coins required at each step
- And, take maximum of **coins** & **mid**, where coins is the sum of **i* steps** and mid is the mid value of the range
- Time complexity : **O(log N)**
- Space complexity : **O(1)**
​
```
class Solution {
public int arrangeCoins(int num) {