package ArraysAndStrings;

import java.util.*;

public class OverHappyNumbers {

	public static int update(int n) {
		int updatedN = 0;
		while(n>0) {
			int digit = n % 10;
			updatedN = updatedN + digit * digit;
			n = n / 10;
		}
		return updatedN;
	}
	public static boolean check(Set<Integer> set, int n) {
		if(n==1) {
			return true;
		}
		
		if(set.contains(n)) {
			return false;
		}
		
		set.add(n);
		n = update(n);
		return check(set,n);
	}
	
	public static boolean isHappy(int n) {
		Set<Integer> set = new HashSet<Integer>();
		return check(set, n);
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		System.out.println(isHappy(n));
		sc.close();
	}

}
