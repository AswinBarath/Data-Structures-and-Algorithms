import java.util.*;

public class MajorityElements {
	public static void main(String args[]) {

		Scanner in = new Scanner(System.in);
		int n = in.nextInt();
		int[] a = new int[n];
		for (int i = 0; i < n; i++) {
			a[i] = in.nextInt();
		}
		int ele1 = 0, ele2 = 0;
		int elec1 = 0, elec2 = 0;

		for (int i = 0; i < n; i++) {
			if (a[i] == ele1) {
				elec1++;
			} else if (a[i] == ele2) {
				elec2++;
			} else if (elec1 == 0) {
				ele1 = a[i];
				elec1 = 1;
			} else if (elec2 == 0) {
				ele2 = a[i];
				elec2 = 1;
			} else {
				elec1--;
				elec2--;
			}
		}

		int count1 = 0, count2 = 0;
		for (int i = 0; i < n; i++) {
			if (a[i] == ele1) {
				count1++;
			} else if (a[i] == ele2) {
				count2++;
			}
		}

		if (count1 <= (n / 3) && count2 <= (n / 3)) {
			System.out.println("No Majority Elements");
		} else {

			if (count1 > n / 3) {
				System.out.print(ele1);
				System.out.print(" ");
			}
			if (count2 > n / 3) {
				System.out.print(ele2);
			}
		}
		in.close();
	}
}