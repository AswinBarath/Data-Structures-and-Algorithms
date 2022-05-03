class Solution {
    public int findUnsortedSubarray(int[] nums) {
        int min = Integer.MAX_VALUE, max = Integer.MIN_VALUE;
        boolean sorted = true;
        // To find minimum element of the unsorted subarray
        for(int i=1; i<nums.length; i++) {
            if(nums[i-1] > nums[i]) {
                sorted = false;
            }
            if(!sorted) {
                min = Math.min(min, nums[i]);
            }
        }
        
        sorted = true;
        // To find maximum element of the unsorted subarray
        for(int j = nums.length - 2; j>=0; j--) {
            if(nums[j] > nums[j+1]) {
                sorted = false;
            }
            if(!sorted) {
                max = Math.max(max, nums[j]);
            }
        }
        // To find the left boundary of unsorted array
        int l;
        for(l=0; l<nums.length; l++) {
            if(min < nums[l]) {
                break;
            }
        }        
        
        // To find the right boundary of unsorted array
        int r;
        for(r=nums.length-1; r>=0; r--) {
            if(max > nums[r]) {
                break;
            }
        }
        
        if(r-l < 0) {
            return 0; // when given array is already sorted
        } else {
            return r - l + 1; // length of unsorted subarray
        }        
    }
}

/*
 * Complexity Analysis
 * 
 * Time complexity : O(n)O(n). Four O(n)O(n) loops are used.
 * 
 * Space complexity : O(1)O(1). Constant space is used.
 */