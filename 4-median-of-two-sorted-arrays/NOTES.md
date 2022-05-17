# [4. Median of Two Sorted Arrays](https://leetcode.com/problems/median-of-two-sorted-arrays/)
​
## Java | Binary Search | Divide & Conquer | Beats 96%
​
### Java Code
​
```
class Solution {
public double findMedianSortedArrays(int[] nums1, int[] nums2) {
if(nums1.length < nums2.length) {
return Median_of_Two_Array(nums1, nums2);
}
else {
return Median_of_Two_Array(nums2, nums1);
}
}
​
public static double Median_of_Two_Array(int[] arr1, int[] arr2) {
​
int lo = 0;
int hi = arr1.length;
int n = arr1.length;
int m = arr2.length;
while (lo <= hi) {
int cut1 = (lo + hi) / 2;
int cut2 = (n + m + 1) / 2 - cut1;
int l1 = cut1 == 0 ? Integer.MIN_VALUE : arr1[cut1 - 1];
int l2 = cut2 == 0 ? Integer.MIN_VALUE : arr2[cut2 - 1];
int r1 = cut1 == n ? Integer.MAX_VALUE : arr1[cut1];
int r2 = cut2 == m ? Integer.MAX_VALUE : arr2[cut2];
​