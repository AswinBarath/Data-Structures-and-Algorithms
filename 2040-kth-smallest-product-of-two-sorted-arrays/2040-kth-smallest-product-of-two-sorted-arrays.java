class Solution {
    public long kthSmallestProduct(int[] nums1, int[] nums2, long k) {
        return kthSmallest(nums1, nums2, k);
    }

	public static long kthSmallest(int[] nums1, int[] nums2, long k) {

		long lo = -1000_000_0000l;
		long hi = 1000_000_0000l;
		long ans = 0;

		// Binary Search
		while (lo <= hi) {
			long mid = (lo + hi) / 2;
			if (countNumberOfElements(nums1, nums2, mid) >= k) {
				ans = mid;
				hi = mid - 1;
			} else {
				lo = mid + 1;
			}
		}
		return ans;

	}

	public static long countNumberOfElements(int[] arr1, int[] arr2, long Dot_pot) {
		long ans = 0;
		for (int e1 : arr1) {
			int count = 0;
			if (e1 >= 0) {
				int lo = 0;
				int hi = arr2.length - 1;
				while (lo <= hi) {
					int mid = (lo + hi) / 2;
					if ((long) e1 * arr2[mid] <= Dot_pot) {
						count = mid + 1;
						lo = mid + 1;
					} else {
						hi = mid - 1;
					}
				}
				ans = ans + count;

			}

			else {

				int lo = 0;
				int hi = arr2.length - 1;
				while (lo <= hi) {
					int mid = (lo + hi) / 2;
					if ((long) e1 * arr2[mid] <= Dot_pot) {
						count = arr2.length - mid;
						hi = mid - 1;

					} else {
						lo = mid + 1;
					}
				}
				ans = ans + count;

			}

		}
		return ans;
	}

}