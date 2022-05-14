class Solution {
    public int divisorSubstrings(int num, int k) {
        int answer = 0;

		// Converting the integer input to string data
		String string_number = Integer.toString(num);

		// Traversing through the string using for loop
		for (int i = 0; i < string_number.length() - k + 1; i++) {
			String t = string_number.substring(i, i + k);
			int temp = Integer.parseInt(t);
			// System.out.println(t); // For debugging
			try {
				if (num % temp == 0) {
					answer++;
				}
			} catch (ArithmeticException e) {
				continue;
			}
		}

		return answer;
    }
}