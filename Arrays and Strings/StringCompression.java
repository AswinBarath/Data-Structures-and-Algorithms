package Assignments;

import java.util.*;

public class StringCompression {

	public static String compress(String str) {
		StringBuilder compressed = new StringBuilder();
		int count = 0;
		for (int i = 0; i < str.length(); i++) {
			count++;

			if ((i + 1) >= str.length() || str.charAt(i) != str.charAt(i + 1)) {
				compressed.append(str.charAt(i));
				compressed.append(count);
				count = 0;
			}
		}
		return compressed.toString();
	}

	public static void main(String args[]) {
		Scanner in = new Scanner(System.in);
		String s = in.next();
		String answer = compress(s);
		System.out.println(answer);
		in.close();
	}
}