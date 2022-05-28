class Solution {
    public boolean checkIfExist(int[] arr) {
        Arrays.sort(arr);
        int res;
        for(int i = 0; i<arr.length; i++) {
            res = check_binarySearch(arr, arr[i]*2);
            if(res != i && res != -1) {
                return true;
            }
        }
        return false;
    }
    public int check_binarySearch(int[] arr, int target) {
        int start = 0;
        int end = arr.length-1;
        while(start<=end) {
            int mid = start + (end - start)/2;

            if(arr[mid] > target) {
                end = mid - 1;
            } else if(arr[mid] < target) {
                start = mid + 1; 
            } else {
                return mid;
            }
        }
        return -1;
    }
}