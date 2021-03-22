public class SumOfBitDiff {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int[] arr = { 1, 3, 8 };

		int count = 0;

		// we have to iterate over every bit
		for (int curr = 1; curr <= 32; curr++) {
			int setCount = 0; // count numbers with current bit as 1

			// check if the curr bit of a number is 1
			for (int num : arr) { // num = 1
				// i have to check num ki 1st bit is 1 or not
				if ((num & (1 << (curr - 1))) != 0) { // that our bit is set
					setCount++;
				}
			}

			int unsetCount = arr.length - setCount;

			count += (setCount * unsetCount * 2);
		}

		System.out.println(count);
	}

}