# [1342. Number of Steps to Reduce a Number to Zero](https://leetcode.com/problems/number-of-steps-to-reduce-a-number-to-zero/)
​
## ✅ Java | 4 Solutions | BitMap-Recursion-Iteration 🔥
​
**Please 🔼 upvote this post if you find the answer useful & do comment about your thoughts 💬**
​
---
​
## Bit Manipulation Solution
​
- The ***maxBinaryDigits*** is obtained by:
- Converting the given number from Integer format to Binary String format
- Then we take the length of the obtained Binary String format and subtract by one to adjust it
- This step is performed to obtain the number of steps required to divide given number by 2
- You can understand this process more by checking the output for this statement this way
- `System.out.println(Integer.toBinaryString(num));`
- `System.out.println(Integer.toBinaryString(num).length());`
- `System.out.println(Integer.toBinaryString(num).length() - 1);`
- The ***numOfOnes*** is obtained by:
- Taking the bit count of the given number, which is the total number of ones present in the binary format of given number
- You can understand this process more by checking the output for this statement this way
- `System.out.println(Integer.toBinaryString(num));`
- `System.out.println(Integer.bitCount(num));`
​
### Java Code
​
```
class Solution {
public int numberOfSteps (int num) {
int maxBinaryDigits = Integer.toBinaryString(num).length() - 1;
int numOfOnes = Integer.bitCount(num);
return maxBinaryDigits + numOfOnes;
}
}
```
​
---
​