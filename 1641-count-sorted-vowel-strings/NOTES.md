# 1641. Count Sorted Vowel Strings
​
## Java | 3 Solutions | Math | DP | Recursion
​
## Mathematical Solution
​
### Java Code
​
```
class Solution {
public int countVowelStrings(int n) {
return ( (n + 4) * (n + 3) * (n + 2) * (n + 1) ) / 24;
}
}
```
​
### Explanation
​
- The problem states that we have to count only the lexicographically sorted strings.
- This means we cannot take "ea" for n=2, but only "ae. Because 'e' comes after 'a' in the Alphabet.
- So, in terms of mathematics you need to calculate the **combination** and not the **permutation**
- To count the combination of sorted vowels of n elements: *formula = C(m + n - 1, n)*, where
- m is size of given set i.e. vovels
- n is the the number of elements
- So, after substituting the above values we get:
- C(m + n - 1, n) = C(5 + n - 1, n) = C(n + 4, n)
- C(n + 4, n) = C(n + 4, (n + 4) - n) = C(n + 4, 4)
- Formula to calculate nCr: