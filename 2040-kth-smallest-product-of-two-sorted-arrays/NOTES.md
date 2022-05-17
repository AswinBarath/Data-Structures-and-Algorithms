# [2040. Kth Smallest Product of Two Sorted Arrays](https://leetcode.com/problems/kth-smallest-product-of-two-sorted-arrays/)
​
## Java | Binary Search Solution
​
### Java Code
​
```
class Solution {
public long kthSmallestProduct(int[] nums1, int[] nums2, long k) {
return kthSmallest(nums1, nums2, k);
}
​
public static long kthSmallest(int[] nums1, int[] nums2, long k) {
​
long lo = -1000_000_0000l;
long hi = 1000_000_0000l;