class Solution {
    public String largestGoodInteger(String num) {
		int count = 0;
		String max = "";
		if (num.length() < 3)
			return max;
		int maxNum = 0;
		for (int i = 1; i < num.length(); i++) {
			if (num.charAt(i) == num.charAt(i - 1)) {
				count++;
				if (count == 2 && maxNum < (int) num.charAt(i)) {
					max = "" + num.charAt(i) + num.charAt(i) + num.charAt(i);
					maxNum = num.charAt(i);
				}
			} else {
				count = 0;
			}
		}
		return max;
    }
}