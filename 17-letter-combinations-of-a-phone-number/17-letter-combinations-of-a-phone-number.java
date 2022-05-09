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
            "pqrs",
            "tuv",
            "wxyz"
        };
        
        letterCombinationsRecursive(digits, mapping, answer, 0, "");
        
        return answer;
    }

	public  void letterCombinationsRecursive(String digits, String[] mapping, List<String> answer, int index,
			String current) {
		if (index == digits.length()) {
			answer.add(current);
			return;
		}

		String letters = mapping[digits.charAt(index) - '0'];
		for (int i = 0; i < letters.length(); i++) {
			letterCombinationsRecursive(digits, mapping, answer, index + 1, current + letters.charAt(i));
		}
    }
}