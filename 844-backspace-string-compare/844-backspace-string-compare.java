class Solution {
    public boolean backspaceCompare(String s, String t) {
        if (helper(s).length() != helper(t).length()) {
			return false;
		} else if (helper(s).equals(helper(t))) {
			return true;
		}
		return false;
    }
    public static String helper(String str) {
		List<Character> s = new ArrayList<Character>();
		for (int i = 0; i < str.length(); i++) {
			if (str.charAt(i) == '#') {
				try {
					s.remove(s.size() - 1);
					continue;
				} catch (Exception e) {
					continue;
				}
			}
			s.add(str.charAt(i));
		}
		String ans = "";
		for (char c : s) {
			ans += c;
		}
		return ans;
	}
}