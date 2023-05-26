package LinkedList.Question;

public class RemoveKeyFromLinkedList {
    public ListNode headNode;

    public void removeKey(int key) {
        ListNode current = headNode;
        ListNode previous = null;   
        if (current != null && current.data == key) {
            headNode = current.next;
        }
        while (current != null && current.data != key) {
            previous = current;
            current = current.next;
        }
        if (current == null) {
            return;
        }
        previous.next = current.next;

    }

}
