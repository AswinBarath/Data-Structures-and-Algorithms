import java.util.ArrayList;
import java.util.List;

public class FindAllAnagramsInString {

	public static boolean comp(int[] pFreq, int[] sFreq) {
		for (int i = 0; i < 26; i++) {
			if (pFreq[i] != sFreq[i]) {
				return false; // anagram not found
			}
		}

		return true; // anagram is found
	}

	public static List<Integer> findAnagrams(String s, String p) {
		List<Integer> ans = new ArrayList<>();
		int[] pFreq = new int[26]; // 0
		int[] sFreq = new int[26]; // 0
		int m = p.length();
		int n = s.length();
		// p = "abc"
		for (int i = 0; i < m; i++) {
			char currChar = p.charAt(i); // i == 0, currChar = 'a';
			int index = currChar - 'a'; // 0
			pFreq[index]++;
		}

		for (int curr = 0; curr < n; curr++) {
			char currChar = s.charAt(curr); // i == 0, currChar = 'a';
			int index = currChar - 'a'; // 0
			sFreq[index]++; // expanding

			// we have to maintain window size == p.length()

			if (curr >= m) { // we need to contract
				int remIndex = curr - m;
				sFreq[s.charAt(remIndex) - 'a']--;
			}
			// both arrays are equal, this means we found anagram
			if (comp(pFreq, sFreq) == true) {
				int occurIndex = curr - m + 1; // si of anagram found
				ans.add(occurIndex);
			}
		}
		// System.out.println(Arrays.toString(pFreq));

		return ans;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<Integer> ans = new ArrayList<>();
		ans = findAnagrams("cbaebabacd", "abc");
		System.out.println(ans);
	}

}
