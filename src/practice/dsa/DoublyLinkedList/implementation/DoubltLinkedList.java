package practice.dsa.DoublyLinkedList.implementation;

class DoublyLinkedList {
    private ListNode head;
    private ListNode tail;
    private int length;

    private class ListNode {
        private int data;
        private ListNode next;
        private ListNode previous;

        public ListNode(int data) {
            this.data = data;
        }
    }

    public DoublyLinkedList() {
        this.head = null;
        this.tail = null;
        this.length = 0;
    }

    public boolean isEmpty() {
        return length == 0;
    }

    public int length() {
        return length;
    }

    public void printForward() {
        if (head == null) {
            return;
        }
        ListNode current = head;
        while (current != null) {
            System.out.print(current.data + "--> ");
            current = current.next;
        }
        System.out.println("End");
    }

    public void printbackward() {
        if (tail == null) {
            return;
        }
        ListNode temp = tail;
        while (temp != null) {
            System.out.print(temp.data + "--> ");
            temp = temp.previous;
        }
        System.out.println("End");
    }

    public void insertAtStart(int data) {

        ListNode newNode = new ListNode(data);
        if (isEmpty()) {
            tail = newNode;
        } else {
            head.previous = newNode;
        }
        newNode.next = head;
        head = newNode;
        length++;
    }

    public void insertAtEnd(int data) {
        ListNode newNode = new ListNode(data);
        if (isEmpty()) {
            head = newNode;
        } else {
            tail.next = newNode;
            newNode.previous = tail;
        }
        tail = newNode;
        length++;
    }

    public ListNode deleteEnd() {
        if (isEmpty()) {
            throw new IllegalArgumentException("No Such Elements");
        }
        ListNode temp = tail;
        if (head == tail) {
            head = null;
        }
        else {
            tail.previous.next = null;
        }
        tail = tail.next;
        temp.previous = null;
        length--;
        return temp;
    }

    public ListNode deleteStart() {
        if (isEmpty()) {
            throw new IllegalArgumentException("No such Elements");
        }
        ListNode temp = head;
        if (head == tail) {
            tail = null;
        } else {
            head.next.previous = null;
        }
        head = head.next;
        temp.next = null;
        length--;
        return temp;
    }

    public static void main(String[] args) {
        DoublyLinkedList d = new DoublyLinkedList();
        d.insertAtStart(2);
        d.insertAtStart(1);
        d.insertAtStart(0);
        d.deleteStart();

        d.insertAtEnd(3);
        d.insertAtEnd(4);
        System.out.println(d.deleteStart().data);
        System.out.println(d.deleteEnd().data);

        d.printForward();
        d.printbackward();
    }
}
