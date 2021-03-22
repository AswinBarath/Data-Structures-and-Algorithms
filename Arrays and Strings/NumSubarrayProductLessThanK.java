
public class NumSubarrayProductLessThanK {
	public static int numSubarrayProductLessThanK(int[] nums, int k) {

		int ans = 0;
		int prod = 1;
		// Two pointers, and expanding by inc end
		for (int start = 0, end = 0; end < nums.length; end++) {

			prod *= nums[end]; // prod = prod * nums[end]

			// when we will contract the window?
			while (start <= end && prod >= k) {
				// contract
				// Throw out unwanted number
				prod = prod / nums[start];
				// contract
				start++;
			}

			// valid subarray count in current window
			ans += (end - start + 1); // length of the window
		}
		return ans;
	}

	public static void main(String[] args) {
		int[] arr = { 10, 5, 2 };
		int answer = numSubarrayProductLessThanK(arr, 100);
		System.out.println(answer);

	}

}
