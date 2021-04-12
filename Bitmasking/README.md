# Problems on Bitmasking

## [Sum of Bit difference](https://practice.geeksforgeeks.org/problems/find-sum-of-different-corresponding-bits-for-all-pairs4652/1)
<details>
        <summary>Problem</summary>

        We define f (X, Y) as number of different corresponding bits in binary representation of X and Y.

        For example, f (2, 7) = 2, since binary representation of 2 and 7 are 010 and 111, respectively.

        The first and the third bit differ, so f (2, 7) = 2.

        You are given an array A of N integers, A1, A2 ,…, AN. Find sum of f(Ai, Aj) for all pairs (i, j) such that 1 ≤ i, j ≤ N.

        Return the answer modulo 10^9+7.

        Example 1:

            Input: N = 2

            A = {2, 4}

            Output: 4

            Explaintion: We return 
                f(2, 2) + f(2, 4) + 
                f(4, 2) + f(4, 4) = 
                0 + 2 + 
                2 + 0 = 4.

        Example 2:

            Input: N = 3

            A = {1, 3, 5}

            Output: 8

            Explaination: We return 
                f(1, 1) + f(1, 3) + f(1, 5) + 
                f(3, 1) + f(3, 3) + f(3, 5) + 
                f(5, 1) + f(5, 3) + f(5, 5) = 
                0 + 1 + 1 + 
                1 + 0 + 2 + 
                1 + 2 + 0 = 8.

        Your Task:

            You do not need to read input or print anything.

            Your task is to complete the function countBits() which takes the value N and the array A as input parameters and returns the desired count modulo 10^9+7.

        Expected Time Complexity: O(N)

        Expected Auxiliary Space: O(1)

        Constraints:

            1 ≤ N ≤ 104

            -2,147,483,648 ≤ A[i] ≤ 2,147,483,647

</details>

[Solution](https://github.com/AswinBarath/Data-Structures-and-Algorithms/blob/main/Bitmasking/SumOfBitDiff.java)

## [Missing Number](https://leetcode.com/problems/missing-number/)
<details>
        <summary>Problem</summary>

        Given an array nums containing n distinct numbers in the range [0, n], return the only number in the range that is missing from the array.

        Follow up: Could you implement a solution using only O(1) extra space complexity and O(n) runtime complexity?

        Example 1:

            Input: nums = [3,0,1]

            Output: 2
            
            Explanation: n = 3 since there are 3 numbers, so all numbers are in the range [0,3]. 2 is the missing number in the range since it does not appear in nums.

        Example 2:

            Input: nums = [0,1]

            Output: 2

            Explanation: n = 2 since there are 2 numbers, so all numbers are in the range [0,2]. 2 is the missing number in the range since it does not appear in nums.

        Example 3:

            Input: nums = [9,6,4,2,3,5,7,0,1]

            Output: 8

            Explanation: n = 9 since there are 9 numbers, so all numbers are in the range [0,9]. 8 is the missing number in the range since it does not appear in nums.

        Example 4:

            Input: nums = [0]

            Output: 1
            
            Explanation: n = 1 since there is 1 number, so all numbers are in the range [0,1]. 1 is the missing number in the range since it does not appear in nums.
        

        Constraints:

            n == nums.length

            1 <= n <= 104

            0 <= nums[i] <= n

            All the numbers of nums are unique.
</details>

[Solution](https://github.com/AswinBarath/Data-Structures-and-Algorithms/blob/main/Bitmasking/MissingNumber.java)

## [Single Number](https://leetcode.com/problems/single-number/)
<details>
    <summary>Problem</summary>

</details>


[Solution](https://github.com/AswinBarath/Data-Structures-and-Algorithms/blob/main/Bitmasking/UniqueNumber2.java)

## [Power of Two](https://leetcode.com/problems/power-of-two/)
<details>
    <summary>Problem</summary>

</details>


[Solution](https://github.com/AswinBarath/Data-Structures-and-Algorithms/blob/main/Bitmasking/IsPowerOfTwo.java)

## [Reduce number to 1](https://www.geeksforgeeks.org/reduce-a-number-to-1-by-performing-given-operations/)
<details>
    <summary>Problem</summary>

</details>

[Solution](https://github.com/AswinBarath/Data-Structures-and-Algorithms/blob/main/Bitmasking/IntegerReplacement.java)

## [Multiple of 3](#)
<details>
    <summary>Problem</summary>

        Take a binary number , if this number multiple of 3 print 1 otherwise print 0.
        
        The given number can range upto 2^100.

        To finish the task , it is recommended to use one traversal of input binary String.

        Input Format:

            The first line contains T denoting the number of testcases. 
            
            Each case contains a string containing 0's and 1's.

        Constraints:

            1<=T<=100, 1<=Length of Input String<=100

        Output Format:

            For each test case, print 1 if string is multiple of 3, else print 0.

        Sample Input:

            2
            011
            100

        Sample Output:

            1
            0

</details>

[Solution](https://github.com/AswinBarath/Data-Structures-and-Algorithms/blob/main/Bitmasking/MultipleOf3.java)
