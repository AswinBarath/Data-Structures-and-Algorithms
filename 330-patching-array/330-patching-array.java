class Solution {
    public int minPatches(int[] nums, int n) {
        // Iterator for nums array
        int i = 0;
        
        // To store count of patch/add operations
        int count = 0;
        
        // Initially, we assume missing number as 1
        long missingNum = 1;
        
        // Logic: Increasing range of missingNum till given 'n'
        while(missingNum <= n) {
            if(i < nums.length && missingNum >= nums[i]) {
                missingNum += nums[i];
                i++;
            }
            else {
                missingNum += missingNum;
                count++;
            }
        }
        return count;
    }
}