package ArraysAndStrings;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class WordDistance1 {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int n = in.nextInt();
		List<String> words = new ArrayList<String>();
		for (int i = 0; i < n; i++) {
			words.add(in.next());
		}
		String w1 = in.next();
		String w2 = in.next();
		int j = 0, w1i = -1, w2i = -1;
		int ans = words.size();
		for (String word : words) {
			if (word.equals(w1)) {
				w1i = j;
			}
			if (word.equals(w2)) {
				w2i = j;
			}
			j++;
			if (w2i != -1 && w1i != -1) {
				ans = Math.min(ans, Math.abs(w2i - w1i));
			}
		}

		System.out.println(ans);
		in.close();

	}

}
