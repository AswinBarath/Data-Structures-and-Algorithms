package ArraysAndStrings;

import java.util.Scanner;

public class TargetZero {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int[] arr = new int[n];
		int num = n / 2;
		for (int i = n - 1; i >= 0; i--) {
			if(n%2==0 && num==0) {
				// exclude zero
				num--;
			}
			arr[i] = num;
			num--;
		}
		for (int a : arr) {
			System.out.print(a + " ");
		}
		sc.close();

	}

}
