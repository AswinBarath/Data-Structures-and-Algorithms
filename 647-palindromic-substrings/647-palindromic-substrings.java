class Solution {
    public int countSubstrings(String s) {
        int result = 0;
		for (int i = 0; i < s.length(); i++) {
			int l = i, r = i;
			while (l >= 0 && r < s.length() && s.charAt(l) == s.charAt(r)) {
				result += 1;
				l -= 1;
				r += 1;
			}
			l = i;
			r = i + 1;
			while (l >= 0 && r < s.length() && s.charAt(l) == s.charAt(r)) {
				result += 1;
				l -= 1;
				r += 1;
			}
		}
		return result;
    }
}