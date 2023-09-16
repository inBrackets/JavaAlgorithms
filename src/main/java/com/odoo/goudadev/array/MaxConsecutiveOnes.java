package com.odoo.goudadev.array;

/**
 * 485. Max Consecutive Ones
 *
 * Given a binary array nums, return the maximum number of consecutive 1's in the array.
 *
 *
 *
 * Example 1:
 *
 * Input: nums = [1,1,0,1,1,1]
 * Output: 3
 * Explanation: The first two digits or the last three digits are consecutive 1s. The maximum number of consecutive 1s is 3.
 * Example 2:
 *
 * Input: nums = [1,0,1,1,0,1]
 * Output: 2
 *
 *
 * Constraints:
 *
 * 1 <= nums.length <= 105
 * nums[i] is either 0 or 1.
 */
public class MaxConsecutiveOnes {
    public int findMaxConsecutiveOnes_3ms(int[] nums) {
        int sum = 0, maxSum = 0;
        for(int n : nums) {
            sum += n;
            sum *= n;
            maxSum = Math.max(maxSum, sum);
        }
        return maxSum;
    }
}
