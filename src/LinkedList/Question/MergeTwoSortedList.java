package LinkedList.Question;

import practice.dsa.LinkedList.Implementation.LinkedList;

public class MergeTwoSortedList {
    public ListNode headNode;
    public ListNode mergeSortedList(ListNode a, ListNode b) {
        ListNode dummy = new ListNode(0);
        ListNode tail = dummy;
        while (a != null && b != null) {
            if (a.data <= b.data) {
                tail.next = a;
                a = a.next;
            } else {
                tail.next = b;
                b = b.next;
            }
            tail = tail.next;
        }
        if (a == null) {
            tail.next = b;
        } else {
            tail.next = b;
        }
        return dummy;
    }

//    public static void main(String[] args) {
//        LinkedList sll1 = new LinkedList();
//        sll1.insertStart(7);
//        sll1.insertStart(5);
//        sll1.insertStart(3);
//        sll1.insertStart(1);
//        sll1.printList();
//        LinkedList sll2 = new LinkedList();
//        sll2.insertEnd(2);
//        sll2.insertEnd(4);
//        sll2.insertEnd(6);
//        sll2.insertEnd(8);
//        sll2.insertEnd(9);
//        sll2.printList();
//        LinkedList result = new LinkedList();
//        result.headNode = mergeTwoLists(sll1.headNode,sll2.headNode);
//        result.printList();
//    }
}
