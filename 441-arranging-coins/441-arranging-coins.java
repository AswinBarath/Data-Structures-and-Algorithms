class Solution {
  public int arrangeCoins(int num) {
	int k = (int)(Math.sqrt(2 * (long)num + 0.25) - 0.5);
    return k;
  }
}