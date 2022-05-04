class Solution {
    public int maxOperations(int[] nums, int k) {
        Arrays.sort(nums);
        int low = 0, high = nums.length - 1, minOperations = 0;
        
        while(low < high){
            if(nums[low] + nums[high] == k){
                low++;
                high--;
                minOperations++;
            } 
            else if(nums[low] + nums[high] > k) high--;
            else low++;
        }
        
        return minOperations;
    }
}