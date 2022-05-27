class Solution {
    public int numberOfSteps (int num) {
        System.out.println(Integer.toBinaryString(num));
        System.out.println(Integer.bitCount(num));
        int maxBinaryDigits = Integer.toBinaryString(num).length() - 1;
        int numOfOnes = Integer.bitCount(num);
	    return maxBinaryDigits + numOfOnes;
    }
}