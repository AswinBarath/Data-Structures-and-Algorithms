package ArraysAndStrings;

import java.util.*;

public class UniqueStrings {
	private static int maxLength(List<String> arr, int i, String ans) {

		// base cases
		if (i == arr.size()) {
			int[] freq = new int[26];
			for (int j = 0; j < ans.length(); j++) {
				if (freq[ans.charAt(j) - 'a'] == 1) {
					return 0;
				}

				freq[ans.charAt(j) - 'a']++;
			}

			return ans.length();
		}

		// recursive cases
		int op1 = Integer.MIN_VALUE, op2 = op1;

		if (ans.length() + arr.get(i).length() <= 26) {
			op1 = maxLength(arr, i + 1, ans + arr.get(i));
		}

		op2 = maxLength(arr, i + 1, ans);
		return Math.max(op1, op2);
	}

	public static int maxLength(List<String> arr) {
		return maxLength(arr, 0, "");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner(System.in);
		int n = in.nextInt();
		List<String> arr = new ArrayList<String>();
		for (int i = 0; i < n; i++) {
			arr.add(in.next());
		}
		System.out.println(maxLength(arr));
		in.close();
	}

}
