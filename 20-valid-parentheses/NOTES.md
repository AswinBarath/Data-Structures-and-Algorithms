# [20. Valid Parentheses](https://leetcode.com/problems/valid-parentheses/)
​
**Please 🔼 upvote this post if you find the answer useful & do comment about your thoughts 💬**
​
## Java Solution
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
Stack<Character> st = new Stack<>();
for (int i = 0; i < s.length(); i++) {
if (s.charAt(i) == '(' || s.charAt(i) == '[' || s.charAt(i) == '{') {
st.push(s.charAt(i));
} else {
if (st.isEmpty()) {
return false;
}
char c = st.peek();
st.pop();
if ((s.charAt(i) == ')' && c == '(')
|| (s.charAt(i) == ']' && c == '[')
|| (s.charAt(i) == '}' && c == '{')) {
continue;
} else {
return false;
}
}
}
// If stack is empty, the given parentheses is balanced, so return true
// Else return false
return st.isEmpty() ? true : false;
}
}
```
​
---
​
### About Stack DS
​
- Stack Data Structure (DS) is a **LIFO** : **L**ast **I**n **F**irst **O**ut
- We have the following common operations available for a Stack DS ***(in Java)***:
- push - insert element in stack
- pop - remove element in stack
- peek - return element from top of the stack
- isEmpty - check if the stack is empty
​
---