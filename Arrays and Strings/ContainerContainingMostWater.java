package ArraysAndStrings;

import java.util.Scanner;

public class ContainerContainingMostWater {

	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int[] arr = new int[n];
		for (int i = 0; i < n; i++) {
			arr[i] = sc.nextInt();
		}

		int left = 0, right = n - 1, max = 0;
		while (left < right) {
			int length = right - left;
			int leftEle = arr[left], rightEle = arr[right];
			int area = leftEle < rightEle ? (leftEle * length) : (rightEle * length);
			max = Math.max(max, area);
			if (leftEle <= rightEle) {
				left++;
			} else {
				right--;
			}
		}
		System.out.println(max);
		sc.close();
	}

}
