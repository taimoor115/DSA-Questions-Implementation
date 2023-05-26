package practice.dsa.Queue.implmentation;
//
//import java.util.NoSuchElementException;
////Implementation in LinkedList
//public class Queue {
//    private ListNode rear;
//    private ListNode front;
//    private int length;
//
//    private class ListNode {
//        private int data;
//        private ListNode next;
//
//        ListNode(int data) {
//            this.data = data;
//            this.next = null;
//        }
//    }
//
//    Queue() {
//        this.front = null;
//        this.rear = null;
//        this.length = 0;
//    }
//
//    public boolean isEmpty() {
//        return length == 0;
//    }
//
//    public int length() {
//        return length;
//    }
//    public void enqueue (int data) {
//        ListNode newNode = new ListNode(data);
//        if (isEmpty()) {
//            front = newNode;
//        } else {
//            rear.next = newNode; //Else part come when we add element 2nd ...n Element in queue
//        }
//        rear = newNode;
//        length++;
//    }
//
//    public int deQueue() {
//        if (isEmpty()) {
//            throw new NoSuchElementException("Queue is Empty");
//        }
//        int result = front.data;
//        front = front.next;
//        if (front == null) {
//            rear = null;
//        }
//        length--;
//        return result;
//    }
//    public int firstElement() {
//        if (isEmpty()) {
//            System.out.println("Queue is Empty");
//        }
//        return front.data;
//    }
//    public int lastElement() {
//        if (isEmpty()) {
//            System.out.println("Queue is Empty");
//        }
//        return rear.data;
//    }
//    public void printQueue() {
//        if (isEmpty()) {
//            return;
//        }
//        ListNode current = front;
//        while (current != null) {
//            System.out.print(current.data+" ");
//            current = current.next;
//        }
//        System.out.println("");
//    }
//    public static void main(String[] args) {
//        Queue q = new Queue();
//        q.enqueue(1);
//        q.enqueue(2);
//        q.enqueue(3);
//        q.enqueue(4);
//        q.printQueue();
//        q.deQueue();
//        q.deQueue();
//        q.printQueue();
//
//    }
//}

// Implementation in Array
//public class Queue {
//    private int[] arr;
//    private int front;
//    private int rear;
//    private int length;
//
//    Queue(int arrSize) {
//        this.arr = new int[arrSize];
//        this.front = 0;
//        this.rear = -1;
//        this.length = 0;
//    }
//
//    public void enQueue(int data) {
//        if (rear == arr.length) {
//            System.out.println("Queue is Full");
//            return;
//        }
//        arr[++rear] = data;
//        length++;
//    }
//    public int deQueue() {
//        if (front == rear +1) {
//            System.out.println("Queue is Empty");
//            return -1;
//        }
//        length --;
//        return arr[front++];
//    }
//    public int peek() {
//        if (front == rear + 1) {
//            System.out.println("Queue is Empty");
//            return -1;
//        }
//        return arr[front];
//    }
//
//    public void printQueue() {
//        if (front == rear + 1) {
//            System.out.println("Queue is Empty");
//            return;
//        }
//        for (int i = front; i < arr.length; i++) {
//            System.out.print(arr[i]+ " ");
//        }
//        System.out.println("");
//    }
//
//    public static void main(String[] args) {
//        Queue q = new Queue(5);
//        q.enQueue(1);
//        q.enQueue(2);
//        q.enQueue(3);
//        q.enQueue(4);
//        q.enQueue(5);
//        q.printQueue();
//        System.out.println("Length of Queue:"+q.length);
//        q.deQueue();
//        q.deQueue();
//        q.printQueue();
//        System.out.println("Length of Queue:"+q.length);
//
//    }
//}
//class DriftingQueue {
//    private int front, rear, size, capacity;
//    private int[] array;
//
//    public DriftingQueue(int capacity) {
//        this.capacity = capacity;
//        this.front = 0;
//        this.rear = -1;
//        this.size = 0;
//        this.array = new int[capacity];
//    }
//
//    public boolean isEmpty() {
//        return size == 0;
//    }
//
//    public boolean isFull() {
//        return size == capacity;
//    }
//
//    public void enqueue(int element) {
//        if (isFull()) {
//            front = (front + 1) % capacity;
//        }
//        rear = (rear + 1) % capacity;
//        array[rear] = element;
//        size++;
//    }
//
//    public int dequeue() {
//        if (isEmpty()) {
//            throw new RuntimeException("Queue is empty");
//        }
//        int element = array[front];
//        front = (front + 1) % capacity;
//        size--;
//        return element;
//    }
//
//    // private void driftFront() {
//    //     front = (front + 1) % capacity;
////        rear = (rear + 1) % capacity;
//    // }
//
//    public void print() {
//        if (isEmpty()) {
//            System.out.println("Queue is empty");
//            return;
//        }
//        System.out.print("Front -> ");
//        for (int i = front; i != rear; i = (i + 1) % capacity) {
//            System.out.print(array[i] + " ");
//        }
//        System.out.println(array[rear] + " <- Rear");
//    }
//
//    public static void main(String[] args) {
//        DriftingQueue q = new DriftingQueue(5);
//
//        q.enqueue(1);
//        q.enqueue(2);
//        q.enqueue(3);
//        q.enqueue(4);
//        q.enqueue(5);
//        q.print();
//        q.enqueue(6);
//        q.print();
//        q.dequeue();
//        q.dequeue();
//        q.print();
//    }
//}
class CircularQueue {
    private int[] arr;
    private int front,rear,length;

    public CircularQueue(int arrSize) {
        this.arr = new int[arrSize];
        this.front = -1;
        this.rear = -1;
        this.length = 0;
    }
    public boolean isEmpty() {
        //Empty Conditions
//        return length == 0;
        return (front == -1 && rear == -1);
    }
    public boolean isFull() {
        // Full Conditions
        return (rear + 1) % arr.length == front;
//         return (rear + 1) == front;
    }
    public void enQueue(int data) {
        if (isEmpty()) {
            front = rear = 0;
            arr[rear] = data;
        } else if (isFull()) {
            System.out.print("Queue is Full");
        } else {
            rear = (rear + 1) % arr.length;
            arr[rear] = data;
        }
        length++;
    }

    public void deQueue() {
        if (isEmpty()) {
            System.out.println("Queue is Empty");
        } else if (front == rear) {
            front = rear = -1;
        } else {
            front = (front + 1) % arr.length;
        }
        length--;
    }
    public void printCircularQueue() {
        System.out.print("Queue is: ");
        int i = front;
        while (i != rear) {
            System.out.print(arr[i] + " ");
            i = (i + 1) % arr.length;
        }
        System.out.print(arr[rear]);
        System.out.println("");
    }
    public static void main(String[] args) {
        CircularQueue c = new CircularQueue(4);
        c.enQueue(1);
        c.enQueue(2);
        c.enQueue(3);
        c.enQueue(4);
        c.printCircularQueue();
        c.deQueue();
        c.printCircularQueue();
        c.enQueue(1);
        c.printCircularQueue();
    }
}