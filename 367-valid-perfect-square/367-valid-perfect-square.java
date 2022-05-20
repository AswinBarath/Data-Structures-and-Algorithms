class Solution {
    public boolean isPerfectSquare(int num) {
        // edge case
        if(num == 1)
            return true;
        
        // Take long data type to also include decimal sqrt of test cases
        long lo = 1;
        // Reducing search space based on given number
        long hi = num / 2;
        
        while(lo<=hi) {
            long mid = lo + (hi - lo) / 2;
            long square = mid * mid;
            
            if(square > num) {
                hi = mid - 1;
            }
            else if(square < num) {
                lo = mid + 1;
            } 
            else {
                return true;
            }
        }
        return false;
    }
}