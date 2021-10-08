package ru.dataart.academy.java;

public class TwoSums {
    /**
     * @param nums   - sorted in ascending order array of integer values >=0
     * @param target - integer value >= 0
     * @return - array of two numbers from nums which sum equals to target
     * Example: nums = [1, 4, 6, 7, 10], target = 10
     * Result - [4, 6]
     * Example: nums = [1, 4, 6, 7, 10], target = 2
     * Result - []
     */
    public int[] getTwoSum(int[] nums, int target) {
        int[] result = new int[0];
        int first = 0;
        int last = nums.length - 1;
        while (first < last) {
            int sum = nums[first] + nums[last];
            if (sum == target) {
                result = new int[]{nums[first], nums[last]};
                return result;
            } else {
                if (sum < target) {
                    first++;
                } else {
                    last--;
                }
            }
        }
        return result;
    }
}