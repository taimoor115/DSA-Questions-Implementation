package LinkedList.Question;

public class ListNode {
    public int data;
    public ListNode next;

    public ListNode(int data) {
        this.data = data;
        this.next = null;
    }
    //Length method
    public int findLength(ListNode headNode) {
        //Check Null Condition
        if (headNode == null) {
            return 0;
        }
        int count = 0;
        ListNode current = headNode;
        while (current != null) {
            count++;
            current = current.next;
        }
        return count;
    }

    //    LinkedList print Function
    public static void printList(ListNode headNode) {
        ListNode current = headNode;
        while (current != null) {
            System.out.print(current.data + " --> ");
            current = current.next;
        }
        System.out.println("Null");
    }
}
