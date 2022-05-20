# [367. Valid Perfect Square](https://leetcode.com/problems/valid-perfect-square/)
​
**Please 🔼 upvote this post if you find the answer useful & do comment about your thoughts 💬**
​
## Java | Binary Search w/ new test cases support
​
- Take long data type to also include decimal sqrt of test cases
- Runtime: 0 ms, faster than 100.00% of Java online submissions for Valid Perfect Square.
​
### Java Code
​
```
class Solution {
public boolean isPerfectSquare(int num) {
// edge case
if(num == 1)
return true;
// Take long data type to also include decimal sqrt of test cases