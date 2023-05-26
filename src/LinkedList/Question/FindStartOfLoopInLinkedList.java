package LinkedList.Question;

import java.util.List;

public class FindStartOfLoopInLinkedList {
    public ListNode headNode;
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
}
