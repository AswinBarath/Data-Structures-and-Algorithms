package Bitmasking;

import java.util.Scanner;

public class IntegerReplacement {

	public static int integerReplacement(int n) {

		// base cases
		if (n == 1) {
			return 0;
		}

		if (n == Integer.MAX_VALUE) {
			return 32;
		}

		// recursive cases
		if ((n & 1) == 0) {
			return integerReplacement(n >> 1) + 1;
		}

		if (n == 3 || n % 4 == 1) {
			return integerReplacement(n - 1) + 1;
		}

		return integerReplacement(n + 1) + 1;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner(System.in);
		int n = in.nextInt();
		System.out.println(integerReplacement(n));
		in.close();
	}

}
