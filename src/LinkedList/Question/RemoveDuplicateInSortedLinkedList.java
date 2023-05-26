package LinkedList.Question;

public class RemoveDuplicateInSortedLinkedList {
    public void remove() {
        if (FindNthNode.headNode == null) {
            return;
        }
        ListNode current = FindNthNode.headNode;
        while (current != null && current.next != null) {
            if (current.data == current.next.data) {
                current.next = current.next.next;
            } else {
                current = current.next;
            }
        }
    }
}
