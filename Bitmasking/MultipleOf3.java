package Bitmasking;

import java.util.*;

public class MultipleOf3 {
	public static void main(String args[]) {
		Scanner in = new Scanner(System.in);
		int t = in.nextInt();
		while (t-- > 0) {
			String num = in.next();

			int odd_count = 0, even_count = 0;

			for (int j = 0; j < num.length(); j++) {
				if (j % 2 == 0 && num.charAt(j) == '1') {
					even_count++;
				}
				if (j % 2 != 0 && num.charAt(j) == '1') {
					odd_count++;
				}
			}
			if ((2 * odd_count + even_count) % 3 == 0) {
				System.out.println(1);
			} else {
				System.out.println(0);
			}
		}
		in.close();
	}
}