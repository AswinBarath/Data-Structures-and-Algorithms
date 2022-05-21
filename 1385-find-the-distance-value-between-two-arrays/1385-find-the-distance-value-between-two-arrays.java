/*
Expression |arr1[i] - arr2[j]| <= d equals to arr1[i] - d <= arr2[j] <= arr1[i] + d. 
So for every value val in the array arr1 we need to check (using binary search), 
if the array arr2 contains any value in range from val - d to val + d. 
If not, increment distance.
*/
class Solution {

    public int findTheDistanceValue(int[] arr1, int[] arr2, int d) {
        Arrays.sort(arr2);    
        int distance = 0;
        
        for (int val : arr1) {
            if (notInRange(arr2, val - d, val + d)) {
                distance++;
            }
        }    
        
        return distance;
    }
    
    // Checks if the array doesn't contain any value in range (from <= value <= to) using binary search
    private static boolean notInRange(int[] arr, int from, int to) {
        int start = 0;
        int end = arr.length - 1;
        
        while (start <= end) {
            int mid = start + (end - start) / 2;
            if (arr[mid] >= from && arr[mid] <= to) {
                return false;
            } else if (arr[mid] < from) {
                start = mid + 1;
            } else {
                end = mid - 1;
            }
        }
        
        return true;
    }
}