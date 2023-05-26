package Implementations.LinkedList.Implementation;


public class LinkedList {
    private ListNode head;

    private static class ListNode {
        private int data;
        private ListNode next;

        public ListNode(int data) {
            this.data = data;
            this.next = null;
        }
    }

    //Print list method
    public void printList() {
        ListNode current = head;
        while (current != null) {
            System.out.print(current.data + " -> ");
            current = current.next;
        }
        System.out.println("null");
    }

    //Find length of SinglyLinkedList
    public int findLength() {
        //Check Null Condition
        if (head == null) {
            return 0;
        }
        int count = 0;
        ListNode current = head;
        while (current != null) {
            count++;
            current = current.next;
        }
        return count;
    }

    //Insert At Start
    public void insertStart(int nodeValue) {
        ListNode newNode = new ListNode(nodeValue);
        newNode.next = head;
        head = newNode;
    }

    //Insert At End
    public void insertEnd(int nodeValue) {
        ListNode newNode = new ListNode(nodeValue);
        if (head == null) {
            head = newNode;
            return;
        }
        ListNode current = head;
        while (current.next != null) {
            current = current.next;
        }
        current.next = newNode;
    }

    //Insert At Any Point
    public void insertPosition(int nodeData, int position) {
        ListNode newNode = new ListNode(nodeData);
        if (head == null) {
            newNode.next = head;
            head = newNode;
        } else {
            ListNode previous = head;
            int count = 1;
            while (count < position - 1) {
                count++;
                previous = previous.next;
            }
            ListNode current = previous.next;
            previous.next = newNode;
            newNode.next = current;
        }
    }

    //Delete At First Index
    public void deleteFirst() {
        if (head == null) {
            return;
        }
        head = head.next;
    }

    //    Delete Last Index
    public void deleteLast() {
        if (head == null || head.next == null) {
            return;
        }
        ListNode secondLastNode = head;
        ListNode lastNode = head.next;
        while (lastNode.next != null) {
            lastNode = lastNode.next;
            secondLastNode = secondLastNode.next;
        }
        secondLastNode.next = null;
    }

    //    Delete at given position
    public void deleteAtPosition(int position) {
        if (position == 1) {
            head = head.next;
        } else {
            ListNode previous = head;
            int count = 1;
            while (count < position - 1) {
                previous = previous.next;
                count++;
            }
            ListNode current = previous.next;
            previous.next = current.next;
        }
    }

    public static void main(String[] args) {
        LinkedList sll = new LinkedList();
//        sll.head = new ListNode(1);
//        ListNode second = new ListNode(2);
//        ListNode third = new ListNode(3);
//        ListNode fourth = new ListNode(4);
//        ListNode fifth = new ListNode(5);
//
////        1|null 2|null 3|null 4|null 5|null
////        Now create chain
//        sll.head.next = second; // 1-->2
//        second.next = third; //  2-->3
//        third.next = fourth; //  3-->4
//        fourth.next = fifth; //  4-->5-->null
//        sll.printList();
//        System.out.println("\n"+sll.findLength());
//        sll.insertStart(3);
//        sll.insertStart(2);
//        sll.insertStart(1);
//        sll.insertEnd(4);
//        sll.insertPosition(3,3);
//        sll.insertEnd(5);
//        sll.insertEnd(6);
//        sll.insertEnd(7);
//        sll.printList();
//        sll.deleteAtPosition(4);
//        sll.deleteFirst();
//        sll.printList();
//        sll.insertEnd(21);
//        sll.printList();
        sll.insertStart(4);
        sll.insertStart(3);
        sll.insertStart(2);
        sll.insertStart(1);
        sll.printList();
        sll.insertStart(6);
        sll.printList();
        sll.insertEnd(5);
        sll.printList();
        sll.insertPosition(4, 4);
        sll.printList();
        sll.deleteFirst();
        sll.printList();
        sll.deleteLast();
        sll.printList();
        sll.deleteAtPosition(4);
        sll.printList();


    }
}
