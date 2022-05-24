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