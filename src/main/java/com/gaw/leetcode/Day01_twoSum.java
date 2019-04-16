package com.gaw.leetcode;

import java.util.Arrays;

/**
 * @author gaopo
 * @date 2019/2/27.
 */
public class Day01_twoSum {
    /**
     * 两数之和给定一个整数数组 nums 和一个目标值 target，请你在该数组中找出和为目标值的那 两个 整数，并返回他们的数组下标。
     * 你可以假设每种输入只会对应一个答案。但是，你不能重复利用这个数组中同样的元素。
     * 示例:
     * 给定 nums = [2, 7, 11, 15], target = 9
     * 因为 nums[0] + nums[1] = 2 + 7 = 9
     * 所以返回 [0, 1]
     * Leetcode题目链接：https://leetcode-cn.com/problems/two-sum/
     */
    public static int[] execute(int[] nums, int target) {
        int[] result = new int[2];
        for (int i = 0; i < nums.length; i++) {
            for (int j = i + 1; j < nums.length; j++) {
                if (nums[i] + nums[j] == target) {
                    result[0] = i;
                    result[1] = j;
                    break;
                }
            }
        }
        return result;
    }

    public static void main(String[] args) {
        int[] source = {1, 2, 3, 5, 6, 7, 8, 9, 10, 34, 53, 275, 868, 38, 452, 578, 2, 458, 856, 365};
        int target = 44;
        int[] result = execute(source, target);
        System.out.println(Arrays.toString(result));
    }

}
