package com.lc;

import java.util.Objects;

/**
 * @author chenzhongzhi
 * @version 1.0
 * @date 2020/12/25 10:17
 */
public class _2 {

    private static ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        if(Objects.isNull(l1) || Objects.isNull(l2)) {
            return null;
        }
        ListNode currentL1 = l1;
        ListNode currentL2 = l2;
        ListNode resultList = new ListNode(0, null);
        ListNode currentNode = resultList;
        int flag = 0;
        while(Objects.nonNull(currentL1) || Objects.nonNull(currentL2)) {
            int value1 = 0, value2 = 0;
            if(Objects.nonNull(currentL1)) {
                value1 = currentL1.val;
                currentL1 = currentL1.next;
            }
            if(Objects.nonNull(currentL2)) {
                value2 = currentL2.val;
                currentL2 = currentL2.next;
            }
            int sum = (value1 + value2 + flag) % 10;
            flag = (value1 + value2 + flag) / 10;
            currentNode.next = new ListNode(sum, null);
            currentNode = currentNode.next;
        }
        if(flag ==1) {
            currentNode.next = new ListNode(1, null);
        }
        return resultList.next;
    }

    public static void main(String[] args) {
        ListNode l1 = new ListNode(2, new ListNode(4, null));
        ListNode l2 = new ListNode(5,new ListNode(6,new ListNode(4)));
        ListNode resultListNode = addTwoNumbers(l1, l2);
        System.out.println(resultListNode);
    }

}

class ListNode {
    int val;
    ListNode next;
    ListNode() {}
    ListNode(int val) { this.val = val; }
    ListNode(int val, ListNode next) { this.val = val; this.next = next; }

    @Override
    public String toString() {
        StringBuffer sb = new StringBuffer();
        sb.append(val).append("-");
        ListNode currentNode = this.next;
        while(Objects.nonNull(currentNode)) {
            sb.append(currentNode.val).append("-");
            currentNode = currentNode.next;
        }
        return sb.toString().substring(0, sb.toString().length() -1);
    }
}