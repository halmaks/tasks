package com.halmaks.tasks;

public class TwoSum {

    public static int[] searchTwoSum(int[] nums, int targetSum) {

        if (nums.length < 2) {
            return new int[]{};
        }

        if (nums.length == 2 && nums[0] + nums[1] == targetSum) {
            return nums;
        }

        for (int i = 0; i < nums.length - 1; i++) {
            for (int j = i + 1; j < nums.length; j++) {
                if (nums[i] + nums[j] == targetSum) {
                    return new int[]{nums[i], nums[j]};
                }
            }
        }
        return new int[]{};
    }
}
