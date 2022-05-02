class Solution {
    public int[] sortArrayByParity(int[] arr) {
		int odd = 0, even = 0;
		while (odd < arr.length && even < arr.length) {
			try {
				while (arr[odd] % 2 == 0) {
					odd++;
				}
				while (even <= odd || arr[even] % 2 != 0) {
					even++;
				}
			} catch (Exception e) {
				continue;
			}
			if (arr[odd] % 2 != 0 && arr[even] % 2 == 0) {
				int temp = arr[odd];
				arr[odd] = arr[even];
				arr[even] = temp;
				odd++;
				even++;
			}
		}
		return arr;
    }
}