package ArraysAndStrings;

import java.util.*;

public class MaximumSumSubarray {
	public static void main(String args[]) {
		Scanner in = new Scanner(System.in);
		int t = in.nextInt();
		while (t-- > 0) {
			int n = in.nextInt();
			int[] arr = new int[n];
			for (int i = 0; i < n; i++) {
				arr[i] = in.nextInt();
			}
			int currSum = 0;
			int maxSum = Integer.MIN_VALUE;
			for (int i = 0; i < n; i++) {
				currSum += arr[i];
				if (currSum < 0) {
					currSum = 0;
				}
				maxSum = Math.max(currSum, maxSum);
			}
			System.out.println(maxSum);
			in.close();
		}
	}
}