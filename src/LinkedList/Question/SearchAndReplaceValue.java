package LinkedList.Question;

public class SearchAndReplaceValue {
    private ListNode head;
    private static class ListNode {
        private int data;
        private ListNode next;

        public ListNode(int data) {
            this.data = data;
            this.next = null;
        }
    }
    public void searchAndReplace(int target, int replaceValue) {
        ListNode current = head;
        while (current != null) {
            if (current.data == target) {
                current.data = replaceValue;
            }
            current = current.next;
        }
    }
    public void printList() {
        ListNode current = head;
        while (current != null) {
            System.out.print(current.data + " -> ");
            current = current.next;
        }
        System.out.println("null");
    }

    public void insertEnd(int nodeData) {
        ListNode newNode = new ListNode(nodeData);
        if (head == null) {
            head = newNode;
            return;
        }
        ListNode current = head;
        while (current.next != null) {
            current = current.next;
        }
        current.next = newNode;
    }

    public static void main(String[] args) {
        SearchAndReplaceValue s = new SearchAndReplaceValue();
        s.insertEnd(1);
        s.insertEnd(2);
        s.insertEnd(3);
        s.insertEnd(4);
        s.insertEnd(15);
        s.printList();
        s.searchAndReplace(15,5);
        s.printList();
    }
}
