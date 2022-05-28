class Solution {
    public int[] intersect(int[] nums1, int[] nums2) {
        Arrays.sort(nums1);
        Arrays.sort(nums2);
        ArrayList<Integer> ans = new ArrayList<Integer>();
        for(int i:nums2){
            int x=binarySearch(nums1,i,ans);
        }
        int[] arr = ans.stream().mapToInt(i -> i).toArray();
        return arr;

            
    }
    public int binarySearch(int[] arr, int target,ArrayList<Integer> ans) {
        int start = 0;
        int end = arr.length - 1;
        while(start <= end) {
            int mid = start + (end - start) / 2;

            if (target < arr[mid]) {
                end = mid - 1;
            } else if (target > arr[mid]) {
                start = mid + 1;
            } else {
                ans.add(arr[mid]);
                arr[mid]=-1;
                Arrays.sort(arr);
                break;  

            }
        }
        return -1;
    }

}