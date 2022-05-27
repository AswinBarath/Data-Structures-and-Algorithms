class Solution {
    public int numberOfSteps (int num) {
        int maxBinaryDigits = Integer.toBinaryString(num).length() - 1;
        int numOfOnes = Integer.bitCount(num);
	    return maxBinaryDigits + numOfOnes;
    }
}