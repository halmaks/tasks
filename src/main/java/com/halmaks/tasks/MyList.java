package com.halmaks.tasks;

import java.util.Stack;

public class MyList {
//    public static void main(String[] args) {
//
//        // adding value
//        ListNode list = new ListNode();
//        int currentVal = 2;
//        while(list.next == null) {
//     //       list.next = currentVal;
//            System.out.println("yes");
//        }
//
//    }

    public ListNode reverseListNode(ListNode head) {
        ListNode current;
        Stack<ListNode> stack = new Stack<>();
        if(head == null){
            return null;
        }
        current = head.next;
        while(current.next != null) {
            stack.push(current);
            current = current.next;

        }
        return null;
    }

}

class ListNode {
    ListNode next;
    int val;
}