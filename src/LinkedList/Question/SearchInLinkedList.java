package LinkedList.Question;

import practice.dsa.LinkedList.Implementation.LinkedList;

public class SearchInLinkedList {
    private ListNode head;
    private static class ListNode {
        private int data;
        private ListNode next;

        public ListNode(int data) {
            this.data = data;
            this.next = null;
        }
    }
    public void printList() {
        ListNode current = head;
        while (current != null) {
            System.out.print(current.data + " -> ");
            current = current.next;
        }
        System.out.println("null");
    }

        public void insertEnd(int nodeData) {
        ListNode newNode = new ListNode(nodeData);
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

        public boolean searchLL(int target) {
            ListNode current = head;
            while (current != null) {
                if (current.data == target) {
                    return true;
                }
                current = current.next;
            }
            return false;
        }


    public static void main(String[] args) {
        SearchInLinkedList s = new SearchInLinkedList();
        s.insertEnd(1);
        s.insertEnd(2);
        s.insertEnd(3);
        s.insertEnd(4);
        s.insertEnd(5);
        s.insertEnd(6);
        s.printList();
        System.out.println(s.searchLL(5));
    }
}
