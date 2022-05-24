class Solution {
    public boolean isValid(String s) {
        // TODO Check if given string is a valid parentheses
        Stack<Character> stack = new Stack<>();
		for (char c : s.toCharArray()) {
			if (c == '(' || c == '[' || c == '{') {
				stack.push(c);
			} else {
				if (stack.isEmpty()) {
					return false;
				}
				char curr = stack.pop();
				if ((curr == '(' && c == ')') 
                    || (curr == '[' && c == ']') 
                    || (curr == '{' && c == '}'))
					continue;
				else
					return false;
			}
		}
		// If stack is empty, the given parentheses is balanced, so return true
		// Else return false
		return stack.isEmpty();
    }
}