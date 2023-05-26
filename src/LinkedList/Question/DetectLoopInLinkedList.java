package LinkedList.Question;

import java.util.List;

public class DetectLoopInLinkedList {
    public static ListNode headNode;

    public boolean detectLoop() {
        ListNode fastPointer = headNode;
        ListNode slowPointer = headNode;
        while (fastPointer != null && fastPointer.next != null) {
            fastPointer = fastPointer.next.next;
            slowPointer = slowPointer.next;
            if (fastPointer.data == slowPointer.data) {
                return true;
            }
        }
        return false;
    }
    public ListNode getStartNode(ListNode slowPointer) {
        ListNode temp = headNode;
        while (slowPointer != temp) {
            temp = temp.next;
            slowPointer = slowPointer.next;
        }
        return temp;
    }

    public ListNode findStartOfLoop() {
        ListNode fastPointer = headNode;
        ListNode slowPointer = headNode;
        while (fastPointer != null && fastPointer.next != null) {
            fastPointer = fastPointer.next.next;
            slowPointer = slowPointer.next;
            if (fastPointer.data == slowPointer.data) {
                return getStartNode(slowPointer);
            }
        }
        return null;
    }


    public void loopLinkedList() {
        ListNode first = new ListNode(1);
        ListNode second = new ListNode(2);
        ListNode third = new ListNode(3);
        ListNode forth = new ListNode(4);
        ListNode fifth = new ListNode(5);
        ListNode sixth = new ListNode(6);
        headNode = first;
        first.next = second;
        second.next = third;
        third.next = forth;
        forth.next = fifth;
        fifth.next = sixth;
        sixth.next = third;
    }
    public void removeLoopFromList() {
        ListNode slowPointer = headNode;
        ListNode fastPointer = headNode;
        while (fastPointer != null && fastPointer.next != null) {
            slowPointer = slowPointer.next;
            fastPointer = fastPointer.next.next;
        }
        if (fastPointer == slowPointer) {
            removeLoop(slowPointer);
            return;
        }
    }
    private void removeLoop(ListNode slowPointer) {
        ListNode current = headNode;
        while (slowPointer.next != current.next) {
            current = current.next;
            slowPointer = slowPointer.next;
        }
        slowPointer.next = null;
    }
    public static void printList() {
        ListNode current = headNode;
        while (current != null) {
            System.out.print(current.data + " --> ");
            current = current.next;
        }
        System.out.println("Null");
    }

    public static void main(String[] args) {
        DetectLoopInLinkedList d = new DetectLoopInLinkedList();
        d.loopLinkedList();
//        d.printList();
//        d.loopLinkedList();
        System.out.println(d.detectLoop());
//        d.detectLoopInLinkedList();
        System.out.println(d.findStartOfLoop().data);
        d.removeLoopFromList();
        printList();
    }
}
