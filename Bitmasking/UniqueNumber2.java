package Bitmasking;

import java.util.*;

public class UniqueNumber2 {
	public static int uniqueNumber(int[] nums) {
		int answer = 0;
		for (int num : nums) {
			answer = answer ^ num;
		}
		return answer;
	}

	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int[] arr = new int[n];
		for (int i = 0; i < n; i++) {
			arr[i] = sc.nextInt();
		}
		System.out.println(uniqueNumber(arr));
		sc.close();
	}
}
