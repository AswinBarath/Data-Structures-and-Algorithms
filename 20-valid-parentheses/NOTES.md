# [20. Valid Parentheses](https://leetcode.com/problems/valid-parentheses/)
​
**Please 🔼 upvote this post if you find the answer useful & do comment about your thoughts 💬**
​
## ✅ Java Solution | Stack DS w/ Explanation 🔥
​
---
​
### Java Solution -> Stack DS
​
- Iterate through the string by scanning each character:
- Whenever we encounter an opening bracket: **(** **[** **{** in the string, push it into the stack
- Now check if the stack is empty to avoid error for the next step
- And, whenever we encounter a closing bracket: **)** **]** **}** in the string
- pop the topmost element (an opening bracket) of the stack
- and check if the popped element is an opening bracket for the respective closing bracket
- Finally return true or false based on the stack is empty or not
- If stack is empty, the given parentheses is balanced, so return true
- Else return false
- Time Complexity -> O(N)
- Space Complexity -> O(N)
​
```
class Solution {