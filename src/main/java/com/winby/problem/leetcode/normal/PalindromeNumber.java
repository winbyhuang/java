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
     * 组成数组，再头尾比较
     */
    public static boolean isPalindrome(int x) {
        boolean result = false;
        if (x < 0 || (x % 10 == 0 && x != 0)) {
            return result;
        }
        byte[] nums = new byte[10];
        int end = 0;
        while (x != 0) {
            nums[end++] = (byte) (x % 10);
            x /= 10;
        }
        int start = 0;
        result = true;
        while (start < --end) {
            if (nums[start] != nums[end]) {
                result = false;
                break;
            }
            start++;
        }
        return result;
    }

    /**
     *组成新数字，比较相等
     * 同一个数字时要除以10
     */
    public boolean isPalindrome2(int x) {
        if (x < 0 || (x % 10 == 0 && x != 0)) {
            return false;
        }
        int newNum = 0;
        while (x > newNum) {
            newNum = newNum * 10 + x % 10;
            x /= 10;
        }
        return (newNum == x || newNum / 10 == x);
    }


    public static void main(String[] args) {
        boolean result;
//        result = isPalindrome(121);
//        System.out.println(result);
//        result = isPalindrome(-121);
//        System.out.println(result);
//        result = isPalindrome(10);
//        System.out.println(result);
        result = isPalindrome(10022201);
        System.out.println(result);
    }
}
