package com.lc.base;

import java.util.Objects;

public class ListNode {
    public int val;
    public ListNode next;

    public ListNode() {
    }

    public ListNode(int val) {
        this.val = val;
    }

    public ListNode(int val, ListNode next) {
        this.val = val;
        this.next = next;
    }

    @Override
    public String toString() {
        StringBuffer sb = new StringBuffer();
        sb.append(val).append("-");
        ListNode currentNode = this.next;
        while (Objects.nonNull(currentNode)) {
            sb.append(currentNode.val).append("-");
            currentNode = currentNode.next;
        }
        return sb.toString().substring(0, sb.toString().length() - 1);
    }
}