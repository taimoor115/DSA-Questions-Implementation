package LinkedList.Question;

public class InsertNodeInSortedLinkedList {
    public ListNode headNode;
    public ListNode insertNodeInSortedList(int data) {
        ListNode newNode = new ListNode(data);
        ListNode current = headNode;
        ListNode previous = null;
        while (current != null && current.data < newNode.data) {
            previous = current;
             current = current.next;
        }
        newNode.next = current;
        previous.next = newNode;
        return headNode;
    }
}
