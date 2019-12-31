package com.winby.problem.leetcode;

import com.alibaba.fastjson.JSON;

import java.util.HashMap;
import java.util.Map;

/**
 * 给定一个整数数组 nums 和一个目标值 target，请你在该数组中找出和为目标值的那 两个 整数，并返回他们的数组下标。
 *
 * 你可以假设每种输入只会对应一个答案。但是，你不能重复利用这个数组中同样的元素。
 *
 * 示例:
 *
 * 给定 nums = [2, 7, 11, 15], target = 9
 *
 * 因为 nums[0] + nums[1] = 2 + 7 = 9
 * 所以返回 [0, 1]
 *
 * 来源：力扣（LeetCode）
 * 链接：https://leetcode-cn.com/problems/two-sum
 * 著作权归领扣网络所有。商业转载请联系官方授权，非商业转载请注明出处。
 */
public class TwoSum {
    /**
     * 循环遍历
     */
    public static int[] solution1(int[] nums, int target) {
        for (int i = 0; i < nums.length; i++) {
            for (int j = i + 1; j < nums.length; j++) {
                if(nums[j] == target - nums[i]){
                    return new int[]{i, j};
                }
            }
        }
        return null;
    }

    /**
     * hash定位
     */
    public static int[] solution2(int[] nums, int target) {
        Map map = new HashMap();
        Object old;
        for (int i = 0; i < nums.length; i++) {
            old = map.get(target-nums[i]);
            if(null == old){
                map.put(nums[i],i);
            }else{
                return new int[]{(int) old, i};
            }
        }
        return null;
    }

    /**
     * bit定位
     */
    public static int[] solution3(int[] nums, int target) {
        //10000000000
        int val = 2048;
        //01111111111
        int aval = val - 1;
        int[] slot = new int[val];
        for (int i = 0; i < nums.length; i++) {
            int oldv = slot[(target - nums[i]) & aval];
            if (0 != oldv) {
                return new int[]{oldv - 1, i};
            }
            slot[nums[i] & aval] = i + 1;
        }
        return null;
    }

    public static void main(String[] args) {
//        int[] nums={2, 7, 11, 15};
//        int target = 9;
//        int[] nums={0,4,3,0};
//        int target = 0;
//        int[] nums={-3,4,3,90};
//        int target = 0;
        int[] nums={230,863,916,585,981,404,316,785,88,12,70,435,384,778,887,755,740,337,86,
                92,325,422,815,650,920,125,277,336,221,847,168,23,677,61,400,136,874,363,394,
                199,863,997,794,587,124,321,212,957,764,173,314,422,927,783,930,282,306,506,44,
                926,691,568,68,730,933,737,531,180,414,751,28,546,60,371,493,370,527,387,43,541,
                13,457,328,227,652,365,430,803,59,858,538,427,583,368,375,173,809,896,370,789};
        int target = 542;
        int[] result;
        result = solution1(nums,target);
        System.out.println(JSON.toJSON(result));
        result = solution2(nums,target);
        System.out.println(JSON.toJSON(result));
        result = solution3(nums,target);
        System.out.println(JSON.toJSON(result));
    }


}
