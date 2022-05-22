class Solution {
    public int arrangeCoins(int num) {
        // TODO Determine no. of coins required to arrange complete staircase using
		// binary search
		long left = 1, right = num;
		long result = 0;
		while (left <= right) {
			long mid = left + (right - left) / 2;
			long coins = (mid * (mid + 1)) / 2; // Gauss's formula
			if (coins > num) {
				right = mid - 1;
			} else {
				left = mid + 1;
				result = Math.max(result, mid);
			}
		}
		return (int) result;
    }
}