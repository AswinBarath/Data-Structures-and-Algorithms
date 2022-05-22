# [1539. Kth Missing Positive Number](https://leetcode.com/problems/kth-missing-positive-number/)
​
**Please 🔼 upvote this post if you find the answer useful & do comment about your thoughts 💬**
​
## ✅ Java | Binary Search | Faster than 100.00% 🔥
​
### Java Code
​
```
class Solution {
public int findKthPositive(int[] arr, int k) {
int l = 0, r = arr.length, m;
while (l < r) {
m = (l + r) / 2;
if (arr[m] - 1 - m < k)
l = m + 1;
else
r = m;
}
return l + k;
}
}
​
/*
Approach:
[2,3,4,7,11], k = 5
the number of missing under A[m] is A[m] - 1 - m.
​
If A[m] - 1 - m < k, m is too small, we update left = m.
If A[m] - 1 - m >= k, m is big enough, we update right = m.
*/
```