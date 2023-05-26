package LinkedList.Question;

import org.w3c.dom.stylesheets.LinkStyle;

public  class FindNthNode{
    public static ListNode headNode ;

    public static void main(String[] args) {
        FindNthNode f = new FindNthNode();
        f.insertAtStart(3);
        f.insertAtStart(2);
        f.insertAtStart(2);
        f.insertAtStart(2);
        f.insertAtStart(1);
        f.printList();

//        ListNode res =f.findNthNodeFromLast(1);
//        System.out.println(res.data);
    }

    public void insertAtStart(int data) {
        ListNode newNode = new ListNode(data);
        newNode.next = headNode;
        headNode = newNode;
    }
    public void insertEnd(int data) {
        ListNode newNode = new ListNode(data);
        if (headNode == null) {
            headNode = newNode;
        }
        ListNode current = headNode;
        while (current.next != null) {
            current = current.next;
        }
        current.next = newNode;
    }
    public void printList() {
        if (headNode == null) {
            return;
        }
        ListNode current = headNode;
        while (current != null) {
            System.out.print(current.data+"--> ");
            current = current.next;
        }
        System.out.println("Null");
    }

    public ListNode findNthNodeFromLast(int n) {
        if (headNode == null) {
            return headNode;
        }
        if (n < 0) {
            throw new IllegalArgumentException("Give positive number");
        }
        ListNode mainPointer = headNode ;
        ListNode refPointer = headNode;
        int count = 0;
        while (count < n) {
            refPointer = refPointer.next;
            count++;
        }
        while (refPointer != null) {
            refPointer = refPointer.next;
            mainPointer = mainPointer.next;
        }
        return mainPointer;
    }


}
