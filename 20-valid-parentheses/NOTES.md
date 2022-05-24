# [20. Valid Parentheses](https://leetcode.com/problems/valid-parentheses/)
​
**Please 🔼 upvote this post if you find the answer useful & do comment about your thoughts 💬**
​
## Java Solution | Stack DS
​
---
​
### Java Solution -> Stack DS
​
-
- Time Complexity -> O(N)
- Space Complexity -> O(N)
​
```
class Solution {
public boolean isValid(String s) {
// TODO Check if given string is a valid parentheses
Stack<Character> stack = new Stack<>();
for (char c : s.toCharArray()) {
if (c == '(' || c == '[' || c == '{') {
stack.push(c);
} else {
if (stack.isEmpty()) {
return false;