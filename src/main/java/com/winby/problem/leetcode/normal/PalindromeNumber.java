package com.winby.problem.leetcode.normal;

/**
 * 9. 回文数
 * isPalindrome
 判断一个整数是否是回文数。回文数是指正序（从左向右）和倒序（从右向左）读都是一样的整数。

 示例 1:

 输入: 121
 输出: true
 示例 2:

 输入: -121
 输出: false
 解释: 从左向右读, 为 -121 。 从右向左读, 为 121- 。因此它不是一个回文数。
 示例 3:

 输入: 10
 输出: false
 解释: 从右向左读, 为 01 。因此它不是一个回文数。
 进阶:

 你能不将整数转为字符串来解决这个问题吗？

 来源：力扣（LeetCode）
 链接：https://leetcode-cn.com/problems/palindrome-number
 著作权归领扣网络所有。商业转载请联系官方授权，非商业转载请注明出处。
 */
public class PalindromeNumber {
    /**
     * 顺序遍历
     */
    public static boolean isPalindrome(int x) {
        byte[] nums = new byte[20];
        int i=0;
        while(x != 0){
//            nums.
        }
        return false;
    }


    public static void main(String[] args) {
        int x = 123;
        boolean result;
        result = isPalindrome(x);
        System.out.println(result);
    }
}
