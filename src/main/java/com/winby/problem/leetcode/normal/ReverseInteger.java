package com.winby.problem.leetcode.normal;

import com.alibaba.fastjson.JSON;

/**
 * 7.整数反转
 * ReverseInteger
 给出一个 32 位的有符号整数，你需要将这个整数中每位上的数字进行反转。

 示例 1:

 输入: 123
 输出: 321
  示例 2:

 输入: -123
 输出: -321
 示例 3:

 输入: 120
 输出: 21
 注意:

 假设我们的环境只能存储得下 32 位的有符号整数，则其数值范围为 [−231,  231 − 1]。请根据这个假设，如果反转后整数溢出那么就返回 0。

 来源：力扣（LeetCode）
 链接：https://leetcode-cn.com/problems/reverse-integer
 著作权归领扣网络所有。商业转载请联系官方授权，非商业转载请注明出处。
 */
public class ReverseInteger {
    /**
     * 顺序遍历
     */
    public static int solution1(int x) {
        int result=0;
        while (x != 0){
            if(result > Integer.MAX_VALUE/10 || (result == (Integer.MAX_VALUE/10) && x%10 >7)){
                return 0;
            }
            if(result <(Integer.MIN_VALUE/10) || (result == (Integer.MIN_VALUE/10) && x%10 < -8)){
                return 0;
            }
            result = (result*10)+(x%10);
            x /= 10;
        }
        return result;
    }


    public static void main(String[] args) {

        int result;
//        result = solution1(123);
//        System.out.println(JSON.toJSON(result));
//        result = solution1(-123);
//        System.out.println(JSON.toJSON(result));
//        result = solution1(120);
//        System.out.println(JSON.toJSON(result));
        result = solution1(1534236469);
        System.out.println(JSON.toJSON(result));
    }

}
