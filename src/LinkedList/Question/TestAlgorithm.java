package LinkedList.Question;

public class TestAlgorithm {
    public ListNode headNode;
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
    public ListNode insertNodeInSortedList(int data) {
        ListNode newNode = new ListNode(data);
        if (headNode == null) {
            return newNode;
        }
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
    public ListNode removeMiddleNode(ListNode head) {
        if (headNode == null) {
            return headNode;
        }
        ListNode slowPointer = headNode;
        ListNode fastPointer = headNode;
        while (fastPointer != null && fastPointer.next != null) {
            slowPointer = slowPointer.next;
            fastPointer = fastPointer.next.next;
        }
        slowPointer.next = slowPointer.next;
        return slowPointer;
    }

    public static void main(String[] args) {
        TestAlgorithm test = new TestAlgorithm();
        test.insertAtStart(1);
        test.insertEnd(3);
        test.insertEnd(5);
        test.insertNodeInSortedList(2);
        test.insertNodeInSortedList(4);
        test.insertEnd(7);
        test.printList();
        test.insertNodeInSortedList(6);
        test.printList();
    }
}
