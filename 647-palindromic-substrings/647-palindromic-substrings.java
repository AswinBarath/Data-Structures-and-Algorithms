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