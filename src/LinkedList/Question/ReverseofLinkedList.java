package LinkedList.Question;

public class ReverseofLinkedList {

    public static void main(String[] args) {
        ReverseofLinkedList rll = new ReverseofLinkedList();
        ListNode node1 = new ListNode(1);
        ListNode node2 = new ListNode(2);
        ListNode node3 = new ListNode(3);
        ListNode node4 = new ListNode(4);
        ListNode node5 = new ListNode(5);
//        Create a Linkage between All of Them
        node1.next = node2;
        node2.next = node3;
        node3.next = node4;
        node4.next = node5;
        rll.printList(node1);
        ListNode reverseResult= rll.reverseLinkedList(node1);
        rll.printList(reverseResult);
    }

    public ListNode reverseLinkedList(ListNode head) {
        if (head == null) {
            return head;
        }
        ListNode current = head;
        ListNode next = null;
        ListNode previous = null;
        while (current != null) {
            next = current.next;
            current.next = previous;
            previous = current;
            current = next;
        }
    return previous;
    }
//    LinkedList print Function
    public void printList(ListNode headNode) {
        ListNode current = headNode;
        while (current != null) {
            System.out.print(current.data + " --> ");
            current = current.next;
        }
        System.out.println("Null");
    }
}
