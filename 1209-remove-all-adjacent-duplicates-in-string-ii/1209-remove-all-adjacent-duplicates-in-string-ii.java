class Solution {
    public String removeDuplicates(String s, int k) {
		Stack<Pair> stack = new Stack<Pair>();
		for (char current : s.toCharArray()) {
			if (stack.isEmpty() || stack.peek().letter != current)
				stack.push(new Pair(current, 1));
			else
				stack.push(new Pair(current, stack.peek().count + 1));
            
			if (stack.peek().count == k) {
				int n = k;
				while (n-- > 0)
					stack.pop();
			}
		}
		StringBuilder sb = new StringBuilder();
		while (!stack.isEmpty())
			sb.append(stack.pop().letter);
		return sb.reverse().toString();
	}
}

class Pair {
	char letter;
	int count;

	public Pair(char letter, int count) {
		super();
		this.letter = letter;
		this.count = count;
	}
}
