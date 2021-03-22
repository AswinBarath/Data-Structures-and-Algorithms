package Bitmasking;

import java.util.*;

public class MissingNumber {
	public static int missingNumber(int[] nums) {
		int x = 0, y = 0;
		for (int num : nums) {
			x = x ^ num;
		}
		for (int i = 0; i <= nums.length; i++) {
			y = y ^ i;
		}
		int answer = x ^ y;
		return answer;
	}

	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int[] arr = new int[n];
		for (int i = 0; i < n; i++) {
			arr[i] = sc.nextInt();
		}
		System.out.println(missingNumber(arr));
		sc.close();
	}
}
