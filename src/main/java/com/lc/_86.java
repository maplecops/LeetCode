package com.lc;

import com.lc.base.ListNode;

import java.util.Objects;

public class _86 {

    private static ListNode partition(ListNode head, int x) {
        ListNode head1 = new ListNode(0);
        ListNode head2 = new ListNode(0);
        ListNode curr1 = head1;
        ListNode curr2 = head2;
        while( Objects.nonNull(head)) {
            if( head.val >= x) {
                curr1.next = head;
                head = head.next;
                curr1 = curr1.next;
            } else {
                curr2.next = head;
                head = head.next;
                curr2 = curr2.next;
            }
            curr1.next = curr2.next = null;

        }
        curr2.next = head1.next;
        return head2.next;
    }

    public static void main(String[] args) {
        // 1->4->3->2->5->2
        ListNode node = new ListNode(1,
                new ListNode(4,
                        new ListNode(3,
                                new ListNode(2,
                                        new ListNode(5,
                                                new ListNode(2))))));
        int x = 3;

        System.out.println(partition(node, x));
    }

}
