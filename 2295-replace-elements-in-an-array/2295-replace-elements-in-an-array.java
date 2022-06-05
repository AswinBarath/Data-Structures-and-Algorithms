class Solution {
    public int[] arrayChange(int[] nums, int[][] operations) {
        int[] arr = new int[1000001];
        for(int i=0;i<nums.length;i++){
            arr[nums[i]] = i;
        }
        for(int i=0;i<operations.length;i++){
            int a = arr[operations[i][0]];
            nums[a] = operations[i][1];
            arr[operations[i][1]] = a;
        }
        return nums;
    }
}