# [374. Guess Number Higher or Lower](https://leetcode.com/problems/guess-number-higher-or-lower/)
​
## Java | Binary Search Solution
​
### Java Code
​
```
public class Solution extends GuessGame {
public int guessNumber(int n) {
int lo = 1, hi = n;
while(lo<=hi) {
// Here we name the mid pointer as pick
int pick = lo + (hi - lo) / 2;
if(guess(pick) == 0) {
return pick;
}
else if(guess(pick) == 1) {
lo = pick + 1;
}
else if(guess(pick) == -1) {
hi = pick - 1;
}
}
return -1;
}
}
​
/**
* Forward declaration of guess API.
* @param  num   your guess
* @return       -1 if num is higher than the picked number
*            1 if num is lower than the picked number
*               otherwise return 0
* int guess(int num);
*/
```