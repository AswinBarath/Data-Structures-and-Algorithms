package ArraysAndStrings;

import java.util.Scanner;

public class CountZeroes {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int ans = 0;
		while(n>0) {
			n = n/5;
			ans = ans + n;
		}
		System.out.println(ans);
		
		sc.close();
	}

}
