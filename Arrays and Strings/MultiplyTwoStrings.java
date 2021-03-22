import java.util.Scanner;

public class MultiplyTwoStrings {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner s = new Scanner(System.in);
		String a = s.next(); // 12
		String b = s.next(); // 15

		boolean isNeg = false;
		if (a.charAt(0) == '-' && b.charAt(0) != '-') {
			isNeg = true;
			a = a.substring(1);
		} else if (a.charAt(0) != '-' && b.charAt(0) == '-') {
			isNeg = true;
			b = b.substring(1);
		} else if (a.charAt(0) == '-' && b.charAt(0) == '-') {
			a = a.substring(1);
			b = b.substring(1);
		}
		int[] arr = new int[a.length() + b.length()];
		for (int curr = a.length() - 1; curr >= 0; curr--) {

			for (int j = b.length() - 1; j >= 0; j--) {
				int mul = (a.charAt(curr) - '0') * (b.charAt(j) - '0');
				arr[curr + j + 1] += mul;
				arr[curr + j] += arr[curr + j + 1] / 10;// here we will place our carry
				arr[curr + j + 1] = arr[curr + j + 1] % 10;
			}
		}

		StringBuilder sb = new StringBuilder();

		for (int num : arr) { // 0, 1, 6, 9
			if (sb.length() == 0 && num == 0) { // leading zero
				// do not append anything
			} else {
				sb.append(num);
			}
		}

		if (isNeg) {
			sb.insert(0, '-');
		}
		System.out.println(sb.toString());

		s.close();
	}

}