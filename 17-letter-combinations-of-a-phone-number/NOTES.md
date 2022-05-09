# 17. Letter Combinations of a Phone Number
​
## Recursive Solution
​
**Companies:** Facebook, Google, Amazon, Microsoft, Uber, JPMorgan, Morgan Stanley
​
## Java Code
​
```
class Solution {
public List<String> letterCombinations(String digits) {
List<String> answer = new ArrayList<String>();
if(digits == null || digits.length() == 0) {
return answer;
}
String[] mapping = {
// To represent number keypad in respective indices
"0",
"1",
"abc",
"def",
"ghi",
"jkl",
"mno",