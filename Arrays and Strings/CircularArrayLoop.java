package ArraysAndStrings;

import java.util.Scanner;

public class CircularArrayLoop {

	public static int next(int[] a, int i) {
		return (i + a[i] + a.length) % a.length;
	}

	public static int circularLoop(int[] v) {
		int n = v.length;
		for (int i = 0; i < n; i++) {
			int slow = i, fast = i;
			if (v[i] == 0) {
				continue;
			}

			while (v[slow] * v[next(v, slow)] > 0 &&
				   v[fast] * v[next(v, fast)] > 0 && 
				   v[fast] * v[next(v, next(v, fast))] > 0) {
				slow = next(v, slow);
				fast = next(v, next(v, fast));

				if (slow == fast) {
					// That means cycle is present, but cycle length should be >1
					if (slow == next(v, slow)) {
						break;
					}
					return 1;
				}
			}

			slow = i;
			int val = v[slow];
			while ((val * v[slow]) > 0) {
				int x = slow;
				slow = next(v, slow);
				v[x] = 0;
			}
		}
		return 0;
	}

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int n = in.nextInt();
		int[] v = new int[n];
		for (int i = 0; i < n; i++) {
			v[i] = in.nextInt();
		}

		System.out.println(circularLoop(v));
		in.close();

	}

}
