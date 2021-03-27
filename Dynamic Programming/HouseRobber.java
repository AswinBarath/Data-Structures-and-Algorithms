package dynamicProgramming;

import java.util.Arrays;

public class HouseRobber {

	public static int rob(int[] nums) {
		int[] dp = new int[nums.length + 1];
		Arrays.fill(dp, -1);
		return rob(nums, nums.length, dp);
	}

	public static int rob(int[] nums, int n, int[] dp) {

		// Base case

		if (n <= 0) {
			return 0;
		}

		if (dp[n] != -1) {
			return dp[n];
		}

		int choice1 = nums[n - 1] + rob(nums, n - 2, dp); // rob
		int choice2 = rob(nums, n - 1, dp); // don't rob

		return dp[n] = Math.max(choice1, choice2);

	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = new int[] { 2, 7, 9, 3, 1 };
		rob(arr);
	}

}
