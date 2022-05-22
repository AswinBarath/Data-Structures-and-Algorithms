# [647. Palindromic Substrings](https://leetcode.com/problems/palindromic-substrings/)
​
**Please 🔼 upvote this post if you find the answer useful & do comment about your thoughts 💬**
​
## ✅ Simple Java Solution | Two Pointers
​
### Java Code
​
- Idea is start from each index and try to extend palindrome for both odd and even length.
​
```
class Solution {
int result = 0;
public int countSubstrings(String s) {
for (int i = 0; i < s.length(); i++) {
checkPalindrome(s, i, i); // Check - Odd length palindromes
checkPalindrome(s, i, i+1);  // Check - Even length palindromes
}
return result;
}
public void checkPalindrome(String s, int l, int r) {
while (l >= 0 && r < s.length() && s.charAt(l) == s.charAt(r)) {
result++;
l--;
r++;
}
}
}
```
​
---
​
**Credits:** Solution video by NeetCode - https://www.youtube.com/watch?v=4RACzI5-du8