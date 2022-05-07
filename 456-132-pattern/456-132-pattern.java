class Solution {
    public boolean find132pattern(int[] nums) {
		if (nums.length < 3)
			return false;
		// Monotonically decreasing stack
		Stack<NumPair> stack = new Stack<>();
		int currMin = nums[0];
		for (int i = 1; i < nums.length; i++) {
			while (!stack.isEmpty() && nums[i] >= stack.peek().num) {
				stack.pop();
			}
			if (!stack.isEmpty() && nums[i] > stack.peek().minLeft) {
				// No need to check if nums[i] (possible 'nums[k]') is smaller than top of stack (possible 'nums[j]')
				// So, we directly check if minimum element (possible 'nums[i]') existed with minLeft
				return true;
			}
			stack.add(new NumPair(nums[i], currMin));
			currMin = Math.min(currMin, nums[i]);
		}
		return false;
    }
}

class NumPair {
	int num;
	int minLeft;

	public NumPair(int num, int minLeft) {
		super();
		this.num = num;
		this.minLeft = minLeft;
	}

}