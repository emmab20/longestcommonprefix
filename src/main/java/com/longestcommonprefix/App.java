package com.longestcommonprefix;

/**
 * Longest common Prefix
 * Write a function to find the longest common prefix string amongst an array of
 * strings.
 *
 * If there is no common prefix, return an empty string "".
 * 
 * Input: strs = ["flower","flow","flight"]
 * Output: "fl"
 * 
 * Input: strs = ["dog","racecar","car"]
 * Output: ""
 * Explanation: There is no common prefix among the input strings.
 *
 */

public class App {
    public static void main(String[] args) {
        String[] input = { "flower", "flow", "flight" };
        System.out.println(longestCommonPrefix(input));

        String[] input2 = { "dog", "racecar", "car" };
        System.out.println(longestCommonPrefix(input2));

        String[] input3 = { "dog", "door", "dragon" };
        System.out.println(longestCommonPrefix(input3));

        String[] input4 = { "dog", "door", "doomsday" };
        System.out.println(longestCommonPrefix(input4));

        String[] input5 = { "doodle", "door", "doomsday" };
        System.out.println(longestCommonPrefix(input5));
    }

    public static String longestCommonPrefix(String[] strs) {
        if (strs.length == 0)
            return "";
        String prefix = strs[0];
        for (int i = 1; i < strs.length; i++)
            while (strs[i].indexOf(prefix) != 0) {
                prefix = prefix.substring(0, prefix.length() - 1);
                if (prefix.isEmpty())
                    return "";
            }
        return prefix;
    }

}
