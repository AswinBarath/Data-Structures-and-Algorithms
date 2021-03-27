package dynamicProgramming;

import java.util.Arrays;

public class DeleteAndEarn {

	public static int deleteAndEarn(int[] nums) {
		int maxEl = Integer.MIN_VALUE;
		for (int num : nums) {
			maxEl = Math.max(num, maxEl);
		}

		int[] count = new int[maxEl + 1];

		for (int num : nums) {
			count[num] += num;
		}
		int[] dp = new int[count.length + 1];
		Arrays.fill(dp, -1);
		return rob(count, count.length, dp);
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
		int[] arr = new int[] { 2, 2, 3, 3, 3, 4 };
		System.out.println(deleteAndEarn(arr));

	}

}
