package LinkedList.Question;
public class FindMiddleNode {

    // First Algorithm
//    public ListNode findMiddleNode(ListNode headNode) {
//        if (headNode == null) {
//            return headNode;
//        }
//        int check = findLength(headNode) / 2;
//        int count = 0;//For treversing because check has int type
//        ListNode current = headNode;
//        while (count < check) {
//            current = current.next;
//            count++;
//        }
//        return current;
//    }
    public ListNode findMiddleNode(ListNode headNode) {
        if (headNode == null) {
            return headNode;
        }
        ListNode slowPointer = headNode;
        ListNode fastPointer = headNode;
        while (fastPointer != null && fastPointer.next != null) {
            slowPointer = slowPointer.next;
            fastPointer = fastPointer.next.next;
        }
        return slowPointer;
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
    //Find length of SinglyLinkedList
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
    public static void main(String[] args) {
        FindMiddleNode fm = new FindMiddleNode();
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
        fm.printList(node1);
        fm.printList(node1);
        ListNode resultant = fm.findMiddleNode(node1);
        fm.printList(resultant);
    }
    }
