package Bitmasking;

import java.util.*;

public class IsPowerOfTwo {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int setCount = 0;

		if (n < 0) {
			System.out.println(false);
		} else {
			while (n > 0) {
				if ((n & 1) == 1) {
					setCount++;
				}
				n >>= 1;
			}
			if (setCount > 1) {
				System.out.println(false);
			} else {
				System.out.println(true);
			}
		}
		sc.close();
	}
}