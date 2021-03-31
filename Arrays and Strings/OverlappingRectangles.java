package ArraysAndStrings;

import java.util.*;

public class OverlappingRectangles {

	public static boolean isRectangleOverlap(int rec1[], int rec2[]) {
		// To check if it's a line
		if (rec1[0] == rec1[2] || rec1[1] == rec1[3] || rec2[0] == rec2[2] || rec2[1] == rec2[3]) {
			// the line cannot have positive overlap
			return false;
		}
		return !(rec1[2] <= rec2[0] || rec1[3] <= rec2[1] || rec1[0] >= rec2[2] || rec1[1] >= rec2[3]);

	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int[] r1 = new int[4];
		for (int i = 0; i < 4; i++) {
			r1[i] = sc.nextInt();
		}

		int[] r2 = new int[4];
		for (int j = 0; j < 4; j++) {
			r2[j] = sc.nextInt();
		}

		System.out.println(isRectangleOverlap(r1, r2));

		sc.close();

	}

}
