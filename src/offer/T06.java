package offer;

import leetcode.Question21;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Stack;

/**
 * @Author: zhuda
 * @Description:
 * @Date: Create in 19:06 2020/3/5
 */



/*
*
* /**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) { val = x; }
 * }
 */

public class T06 {

    public static void main(String[] args) {

        ListNode one = new ListNode(1);
        ListNode two = new ListNode(2);
        ListNode three = new ListNode(3);

        one.next = two;
        two.next = three;
        three.next = null;

        System.out.println(Arrays.toString(reversePrint(one)));
    }

    public static int[] reversePrint(ListNode head) {
        Stack<ListNode> stack = new Stack<>();

        while (head != null) {
            stack.push(head);
            head = head.next;
        }

        int[] temp = new int[stack.size()];
        int i = 0;
        while (!stack.empty()) {
            temp[i] = stack.pop().val;
            i++;
        }

        return temp;

    }


    static class ListNode {
        int val;
        ListNode next;
        ListNode(int x) { val = x; }
    }
}
