package com.halmaks.tasks;

import java.util.HashSet;
import java.util.Set;

public class TwoSum {

    public static int[] searchTwoSumWithLineTime(int[] nums, int targetSum) {

        Set<Integer> tmp = new HashSet<>();
        for (int i = 0; i < nums.length; i++) {
            if (tmp.contains(targetSum - nums[i])) {
                return new int[]{targetSum - nums[i], nums[i]};
            }
            tmp.add(nums[i]);
        }

        return new int[]{};
    }

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
