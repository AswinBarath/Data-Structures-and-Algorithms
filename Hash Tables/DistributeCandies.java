package ArraysAndStrings;

import java.util.*;

public class DistributeCandies {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int[] candies = new int[n];

		for (int i = 0; i < n; i++) {
			candies[i] = sc.nextInt();
		}
		Set<Integer> set = new HashSet<Integer>();
		for(int i = 0; i<candies.length; i++) {
			set.add(candies[i]);
		}
		int setSize = set.size();
		int answer = setSize < n/2 ? setSize: n/2;
		System.out.println(answer);

		sc.close();
	}

}
