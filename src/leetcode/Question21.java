package leetcode;

/**
 * @Author: zhuda
 * @Description: 合并两个链表 减治法
 * @Date: Create in 9:38 2019/4/2
 *
 *
 * 输入：1->2->4, 1->3->4
 * 输出：1->1->2->3->4->4
 *
 */
public class Question21 {


    public static void main(String[] args) {

        ListNode node1 = new ListNode(1);
        node1.next = new ListNode(2);
        node1.next.next = new ListNode(4);

        ListNode node2 = new ListNode(1);
        node2.next = new ListNode(3);
        node2.next.next = new ListNode(4);

        outPut(mergeTwoLists(node1, node2));

    }

    public static ListNode mergeTwoLists(ListNode l1, ListNode l2) {

        ListNode headL1 = new ListNode(-1);
        headL1.next = l1;
        ListNode headL2 = new ListNode(-2);
        headL2.next = l2;

        if (l1 == null) {
            return l2;
        }
        if (l2 == null) {
            return l1;
        }

        while (headL1.next != null) {
            if (l2.val <= headL1.val) {
                ListNode newL2 = l2.next;
                l2.next = headL1.next;
                headL1.next = l2;
                l2 = newL2;
                outPut(l1);
                break;
            } else {
                headL1 = headL1.next;
            }
        }

        if (l2 != null) {
            mergeTwoLists(l1, l2);
        }
        return headL1;
    }


    public static void outPut(ListNode result) {
        while (result.next != null) {
            System.out.print(result.val + " ");
            result = result.next;
        }
        System.out.println();
    }

    /**
     * @Author: zhuda
     * @Description:
     * @Date: Create in 9:40 2019/4/2
     */
    public static class ListNode {
        public int val;
        ListNode next;
        ListNode(int x) { val = x; }
    }
}
