package com.winby.problem.leetcode;

import com.alibaba.fastjson.JSON;

/**
 给出两个 非空 的链表用来表示两个非负的整数。其中，它们各自的位数是按照 逆序 的方式存储的，并且它们的每个节点只能存储 一位 数字。

 如果，我们将这两个数相加起来，则会返回一个新的链表来表示它们的和。

 您可以假设除了数字 0 之外，这两个数都不会以 0 开头。

 示例：

 输入：(2 -> 4 -> 3) + (5 -> 6 -> 4)
 输出：7 -> 0 -> 8
 原因：342 + 465 = 807

 来源：力扣（LeetCode）
 链接：https://leetcode-cn.com/problems/add-two-numbers
 著作权归领扣网络所有。商业转载请联系官方授权，非商业转载请注明出处。
 */
public class AddTwoNumbers {
    /**
     * 顺序遍历
     */
    public static ListNode solution1(ListNode l1, ListNode l2) {
        ListNode result = new ListNode(0);
        ListNode last = result;
        while (l1 != null || l2 != null) {
            int a = l1 != null ? l1.val : 0;
            int b = l2 != null ? l2.val : 0;
            int sum = last.next == null ? a + b : a + b + 1;
            last.next = new ListNode(sum % 10);
            last = last.next;
            if (sum > 9) {
                last.next = new ListNode(1);
            }

            if (l1 != null) {
                l1 = l1.next;
            }
            if (l2 != null) {
                l2 = l2.next;
            }
        }
        return result.next;
    }


    public static void main(String[] args) {
//        ListNode l1 = new ListNode(5);
//        ListNode l2 = new ListNode(6);

        ListNode l1 = new ListNode(2);
        l1.next=new ListNode(4);
        l1.next.next=new ListNode(3);
        ListNode l2 = new ListNode(5);
        l2.next=new ListNode(6);
        l2.next.next=new ListNode(4);

        ListNode result;
        result = solution1(l1,l2);
        System.out.println(JSON.toJSON(result));
    }
  public static class ListNode {
      int val;
      ListNode next;
      ListNode(int x) { val = x; }
  }

}
