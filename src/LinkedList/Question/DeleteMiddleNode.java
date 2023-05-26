package LinkedList.Question;

public class DeleteMiddleNode {
    public ListNode head;
    public ListNode deleteMiddle(ListNode head) {
        if (head == null || head.next == null) {
            return null;
        }
        ListNode slowPointer = head;
        ListNode fastPointer = head;
        ListNode previous = null;
        while (fastPointer != null && fastPointer.next != null) {
            previous = slowPointer;
            slowPointer = slowPointer.next;
            fastPointer = fastPointer.next.next;
        }
        previous.next = slowPointer.next;
        return head;
    }

}
