package Arrays;

public class PowerOfFour {

	public static boolean isPowerOfFour(int n) {
		if (n == 1)
			return true;
		int count = 0;
		int i = 0;
		boolean evenPos = false;
		while (n > 0) {
			// System.out.println(count + " " + n);
			if ((n & 1) == 1) {// && (i%2==0)) {
				count++;
				if (i % 2 == 0) {
					evenPos = true;
				}
			}
			n = n >> 1;
			i++;
		}
		if (count == 1 && evenPos) {
			return true;
		}
		return false;
	}

	public static void main(String[] args) {
		System.out.println(isPowerOfFour(16)); // example: 16
	}

}