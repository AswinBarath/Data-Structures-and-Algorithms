package dynamicProgramming;

import java.util.Arrays;

public class CoinChange2 {

	public static int change(int amount, int[] coins) {

		int[][] dp = new int[coins.length + 1][amount + 1];
		for (int[] row : dp) {
			Arrays.fill(row, -1);
		}
		return change(amount, coins, coins.length, dp);
	}

	public static int change(int amount, int[] coins, int n, int[][] dp) {
		if (amount == 0) { // banna gya
			return 1;
		}

		if (n == 0) { // no currency
			return 0;
		}
		if (dp[n][amount] != -1) {
			return dp[n][amount];
		}

		int choose = 0, reject = 0;

		if (coins[n - 1] <= amount) {
			choose = change(amount - coins[n - 1], coins, n, dp);
		}

		reject = change(amount, coins, n - 1, dp);

		return dp[n][amount] = choose + reject;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = new int[] { 1, 2, 5 };
		System.out.println(change(5, arr));
	}
}