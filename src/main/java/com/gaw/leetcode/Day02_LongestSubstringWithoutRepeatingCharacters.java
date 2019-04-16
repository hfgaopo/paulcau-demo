package com.gaw.leetcode;

import java.util.HashMap;

/**
 * @author gaopo
 * @date 2019/2/27.
 */
public class Day02_LongestSubstringWithoutRepeatingCharacters {
    /**
     * 无重复字符的最长子串给定一个字符串，请你找出其中不含有重复字符的 最长子串 的长度。
     * 示例 1: 	输入: "abcabcbb" 	输出: 3  	解释: 因为无重复字符的最长子串是 "abc"，所以其长度为 3。
     * 示例 2: 	输入: "bbbbb"  	输出: 1 	解释: 因为无重复字符的最长子串是 "b"，所以其长度为 1。
     * 示例 3: 	输入: "pwwkew" 	输出: 3 	解释: 因为无重复字符的最长子串是 "wke"，所以其长度为 3。
     * 请注意，你的答案必须是 子串 的长度，"pwke" 是一个子序列，不是子串。
     * Leetcode题目链接：https://leetcode-cn.com/problems/longest-substring-without-repeating-characters/
     */

    public static int execute1(String s) {
        char[] strArr = s.toCharArray();
        StringBuilder result = new StringBuilder();
        int maxLen = 0;
        for (int i = 0; i < strArr.length; ) {
            int index = result.toString().indexOf(String.valueOf(strArr[i]));
            if (index >= 0) {
                for (int j = index; j >= 0; j--) {
                    result = result.deleteCharAt(j);
                }
            } else {
                result.append(String.valueOf(strArr[i]));
                if (result.toString().length() > maxLen) {
                    maxLen = result.toString().length();
                }
                i++;
            }
        }
        return maxLen;
    }

    public static int execute2(String s) {
        char[] strArr = s.toCharArray();
        StringBuilder result = new StringBuilder();
        int maxlen = 0;
        for (int i = 0; i < strArr.length; i++) {
            char[] resultArr = result.toString().toCharArray();
            for (int j = 0; j < resultArr.length; j++) {
                if (resultArr[j] == strArr[i]) {
                    for (int k = j; k >= 0; k--) {
                        result.deleteCharAt(k);
                    }
                    break;
                }
            }
            result.append(strArr[i]);
            if (maxlen < result.toString().length()) {
                maxlen = result.toString().length();
            }
        }
        return maxlen;
    }

    public static int execute(String s) {
        char[] strArr = s.toCharArray();
        HashMap<Character, Integer> result = new HashMap(Math.toIntExact(Math.round(s.length() / 0.75)));
        int maxLen = 0;
        for (int i = 0; i < strArr.length; ) {
            if (result.containsKey(strArr[i])) {
                //result = result.
            }
            result.put(strArr[i], i);
            i++;
        }
        return result.size();
    }

    public static void main(String[] args) {
        int result = execute2("pwwswp");
        System.out.println(Math.round(-1.51));
    }

}
