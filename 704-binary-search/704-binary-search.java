class Solution {
    public int search(int[] nums, int target) {
        
        // Defining low and high pointers
        int lo = 0, hi = nums.length - 1;
                
        while(lo <= hi) {
            
            // Defining mid pointer
            int mid = (lo + hi) / 2;
            
            if(nums[mid] == target) {
                return mid;
            }
            else if(nums[mid] < target) {
                lo = mid + 1;
            } 
            else {
                hi = mid - 1;
            }
        }
        return -1;
    }
}