package ArraysAndStrings;

import java.util.*;

public class MoveZeroes {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int n = in.nextInt();
		int[] arr = new int[n];
		for (int i = 0; i < n; i++) {
			arr[i] = in.nextInt();
		}

		for (int i = 0, j=0; i < n; i++) {
			if(arr[i] != 0) {
				// swap with end
				int temp = arr[i];
				arr[i] = arr[j];
				arr[j] = temp;
				j++;
			}
		}
		for(int num : arr) {
			System.out.print(num + " ");
		}
		in.close();

	}

}
