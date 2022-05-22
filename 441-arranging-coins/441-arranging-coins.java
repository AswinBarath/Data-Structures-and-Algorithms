class Solution {
    public int arrangeCoins(int num) {
        // TODO Determine no. of coins required to arrange complete staircase using
		// linear algo
		int result = 0;
		int step = 1;
		while (num >= 0) {
			num -= step;
			step++;
			result++;
			if (num < 0) {
				// When step is incomplete - num will become negative
				result--;
			}
		}
		return result;
    }
}