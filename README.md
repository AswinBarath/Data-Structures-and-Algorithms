# Problems on Data Structures and Algorithms

<span style="font-size: 150%;">

### Arrays & Strings

- [x] [Subarray Product Less Than K](https://leetcode.com/problems/subarray-product-less-than-k/)
    - [Solution](https://github.com/AswinBarath/Data-Structures-and-Algorithms/blob/main/Arrays%20and%20Strings/NumSubarrayProductLessThanK.java)
- [x] [Find All Anagrams in a String](https://leetcode.com/problems/find-all-anagrams-in-a-string/) 
    - [Solution](https://github.com/AswinBarath/Data-Structures-and-Algorithms/blob/main/Arrays%20and%20Strings/FindAllAnagramsInString.java)
- [x] [Multiply Strings](https://leetcode.com/problems/multiply-strings/) 
    - [Solution](https://github.com/AswinBarath/Data-Structures-and-Algorithms/blob/main/Arrays%20and%20Strings/MultiplyTwoStrings.java)
- [x] [Majority Element II](https://leetcode.com/problems/majority-element-ii/) 
    - [Solution](https://github.com/AswinBarath/Data-Structures-and-Algorithms/blob/main/Arrays%20and%20Strings/MajorityElements.java)
- [x] [Maximum Length of a Concatenated String with Unique Characters](https://leetcode.com/problems/maximum-length-of-a-concatenated-string-with-unique-characters/)
    - [Solution](https://github.com/AswinBarath/Data-Structures-and-Algorithms/blob/main/Arrays%20and%20Strings/UniqueStrings.java)
- [x] [String Compression](https://leetcode.com/problems/string-compression/description/)
    - [Solution](https://github.com/AswinBarath/Data-Structures-and-Algorithms/blob/main/Arrays%20and%20Strings/StringCompression.java)
- [x] [Container Containing Most Water](https://leetcode.com/problems/container-with-most-water/)
    - [Solution](https://github.com/AswinBarath/Data-Structures-and-Algorithms/blob/main/Arrays%20and%20Strings/ContainerContainingMostWater.java)
- [x] [Power of Four](https://leetcode.com/problems/power-of-four/)
    - [Solution](https://github.com/AswinBarath/Data-Structures-and-Algorithms/blob/main/Arrays%20and%20Strings/PowerOfFour.java)
- [x] [Circular Array Loop](https://leetcode.com/problems/circular-array-loop/)
    - [Solution](https://github.com/AswinBarath/Data-Structures-and-Algorithms/blob/main/Arrays%20and%20Strings/CircularArrayLoop.java)
- [x] [Maximum Subarray](https://leetcode.com/problems/maximum-subarray/)
    - [Solution](https://github.com/AswinBarath/Data-Structures-and-Algorithms/blob/main/Arrays%20and%20Strings/MaximumSumSubarray.java)
- [x] [Move Zeroes](https://leetcode.com/problems/move-zeroes/description/)
    - [Solution](https://github.com/AswinBarath/Data-Structures-and-Algorithms/blob/main/Arrays%20and%20Strings/MoveZeroes.java)
- [x] [Count Zeroes](https://leetcode.com/problems/factorial-trailing-zeroes/)
    - [Solution](https://github.com/AswinBarath/Data-Structures-and-Algorithms/blob/main/Arrays%20and%20Strings/CountZeroes.java)
- [x] [Target Zero]()
    - [Solution](https://github.com/AswinBarath/Data-Structures-and-Algorithms/blob/main/Arrays%20and%20Strings/TargetZero.java)
- [x] [Overlapping Rectangles](https://leetcode.com/problems/rectangle-overlap/)
    - [Solution](https://github.com/AswinBarath/Data-Structures-and-Algorithms/blob/main/Arrays%20and%20Strings/OverlappingRectangles.java)
- [x] [Word Distance I](https://leetcode.com/problems/shortest-word-distance/)
    - [Solution](https://github.com/AswinBarath/Data-Structures-and-Algorithms/blob/main/Arrays%20and%20Strings/WordDistance1.java)



### Hash Tables

- [x] [Distribute Candies](https://leetcode.com/problems/distribute-candies/)
    - [Solution](https://github.com/AswinBarath/Data-Structures-and-Algorithms/blob/main/Hash%20Tables/DistributeCandies.java)

- [x] [Happy Numbers](https://leetcode.com/problems/happy-number/)
    - [Solution](https://github.com/AswinBarath/Data-Structures-and-Algorithms/blob/main/Hash%20Tables/OverHappyNumbers.java)



### Bitmasking

- [x] [Sum of Bit difference](https://practice.geeksforgeeks.org/problems/find-sum-of-different-corresponding-bits-for-all-pairs4652/1)
    - <details>
        <summary>Problem</summary>
        We define f (X, Y) as number of different corresponding bits in binary representation of X and Y. For example, f (2, 7) = 2, since binary representation of 2 and 7 are 010 and 111, respectively. The first and the third bit differ, so f (2, 7) = 2.

        You are given an array A of N integers, A1, A2 ,…, AN. Find sum of f(Ai, Aj) for all pairs (i, j) such that 1 ≤ i, j ≤ N. Return the answer modulo 10^9+7.
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
            You do not need to read input or print anything. Your task is to complete the function countBits() which takes the value N and the array A as input parameters and returns the desired count modulo 10^9+7.

        Expected Time Complexity: O(N)
        Expected Auxiliary Space: O(1)

        Constraints:
            1 ≤ N ≤ 104
            -2,147,483,648 ≤ A[i] ≤ 2,147,483,647

      </details>
    - [Solution](https://github.com/AswinBarath/Data-Structures-and-Algorithms/blob/main/Bitmasking/SumOfBitDiff.java)

- [x] [Missing Number](https://leetcode.com/problems/missing-number/)
    - [Solution](https://github.com/AswinBarath/Data-Structures-and-Algorithms/blob/main/Bitmasking/MissingNumber.java)

- [x] [Single Number](https://leetcode.com/problems/single-number/)
    - [Solution](https://github.com/AswinBarath/Data-Structures-and-Algorithms/blob/main/Bitmasking/UniqueNumber2.java)

- [x] [Power of Two](https://leetcode.com/problems/power-of-two/)
    - [Solution](https://github.com/AswinBarath/Data-Structures-and-Algorithms/blob/main/Bitmasking/IsPowerOfTwo.java)

- [x] [Reduce number to 1](https://www.geeksforgeeks.org/reduce-a-number-to-1-by-performing-given-operations/)
    - [Solution](https://github.com/AswinBarath/Data-Structures-and-Algorithms/blob/main/Bitmasking/IntegerReplacement.java)

- [x] [Multiple of 3](https://github.com/AswinBarath/Data-Structures-and-Algorithms/blob/main/Bitmasking/MultipleOf3.txt)
    - [Solution](https://github.com/AswinBarath/Data-Structures-and-Algorithms/blob/main/Bitmasking/MultipleOf3.java)



### Dynamic Prgramming

- [x] [Coin Change 2](https://leetcode.com/problems/coin-change-2/)
    - [Solution](https://github.com/AswinBarath/Data-Structures-and-Algorithms/blob/main/Dynamic%20Programming/CoinChange2.java)

- [x] [Delete and Earn](https://leetcode.com/problems/delete-and-earn/)
    - [Solution](https://github.com/AswinBarath/Data-Structures-and-Algorithms/blob/main/Dynamic%20Programming/DeleteAndEarn.java)

- [x] [House Robber](https://leetcode.com/problems/house-robber/)
    - [Solution](https://github.com/AswinBarath/Data-Structures-and-Algorithms/blob/main/Dynamic%20Programming/HouseRobber.java)


</span>