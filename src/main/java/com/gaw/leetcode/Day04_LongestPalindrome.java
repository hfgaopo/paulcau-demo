package com.gaw.leetcode;

/**
 * @author gaopo
 * @date 2019/3/14.
 */
public class Day04_LongestPalindrome {
    /**
     * 给定一个字符串 s，找到 s 中最长的回文子串。你可以假设 s 的最大长度为 1000。
     * <p>
     * 示例 1：
     * <p>
     * 输入: "babad"
     * 输出: "bab"
     * 注意: "aba" 也是一个有效答案。
     * 示例 2：
     * <p>
     * 输入: "cbbd"
     * 输出: "bb"
     */

    public static String execute(String s) {
        String result = "";
        char[] input = s.toCharArray();
        for (int i = 0; i < input.length; i++) {
            StringBuilder temp = new StringBuilder();
            for (int j = i; j < input.length; j++) {
                temp.append(input[j]);
                if (temp.length() > result.length() && judge(temp.toString())) {
                    result = temp.toString();
                }
            }
        }
        return result;
    }

    private static boolean judge(String input) {
        char[] inputArray = input.toCharArray();
        for (int i = 0; i < inputArray.length / 2; i++) {
            if (inputArray[i] != inputArray[inputArray.length - 1 - i]) {
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        System.out.println(execute("babad"));
    }
}
