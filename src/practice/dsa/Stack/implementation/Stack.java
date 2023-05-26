package practice.dsa.Stack.implementation;

import java.util.EmptyStackException;

// Linked List Implementation of Stack:
public class Stack {
    private ListNode top;
    private int length;

    private class ListNode {
        private int data;
        private ListNode next;

        ListNode(int data) {
            this.data = data;
        }
    }

    public Stack() {
        top = null;
        length = 0;
    }

    public int length() {
        return length;
    }

    public boolean isEmpty() {
        return length == 0;
    }

    public void push(int data) {
       ListNode newNode = new ListNode(data);
       if (isEmpty()) {
           top = newNode;
       } else {
           newNode.next = top;
           top = newNode;
       }
        length++;
    }

    public int pop() {
        if (isEmpty()) {
            throw new EmptyStackException();
        }
        int result = top.data;
        top = top.next;
        length--;
        return result;
    }
    public int peek() {
        if(isEmpty()) {
            throw new EmptyStackException();
        }
        return top.data;
    }
    public void printStack() {
        ListNode current = top;
        while (current != null) {
            System.out.print(current.data + "--> ");
            current = current.next;
        }
        System.out.println("Null");
    }
    public static void main(String[] args) {
        Stack stack = new Stack();
        stack.push(4);
        stack.push(3);
        stack.push(2);
        stack.push(1);
        stack.printStack();
        stack.pop();
        stack.pop();
        stack.printStack();

    }
}

//import java.util.EmptyStackException;

//public class Stack {
//    private int[] arr;
//    private int top;
//    private int size;
//
//    public Stack(int size) {
//        this.arr = new int[size];
//        this.top = -1;
//        this.size = size;
//    }
//
//    public void push(int data) {
//        if (top == size - 1) {
//            System.out.println("Stack is full!");
//            return;
//        }
////        Two ways
////        1.
////        top++;
////        arr[top] = data;
////        2.
//        arr[++top] = data;
//    }
//
//    public int pop() {
//        if (top == -1) {
//            System.out.println("Stack is empty!");
//            return -1;
//        }
//        return arr[top--];
//    }
//
//    public void printStack() {
//        if (top == -1) {
//            System.out.println("Stack is empty!");
//            return;
//        }
//        for (int i = top; i >= 0; i--) {
//            System.out.print(arr[i] + " ");
//        }
//        System.out.println("");
//    }
//    public int peek() {
//        if (top == -1) {
//            System.out.println("List is Empty");
//        }
//        return arr[top];
//    }
//
//    public static void main(String[] args) {
//        Stack stack = new Stack(5);
//        stack.push(1);
//        stack.push(2);
//        stack.push(3);
//        stack.push(4);
//        stack.push(5);
////        stack.push(6);
////        stack.push(7);
//        stack.printStack();
//        stack.pop();
//        stack.pop();
//        stack.pop();
//        stack.printStack();
//    }
//}
//public class Stack{
//    //Two Ended Stack
//    private int [] arr;
//    private int size;
//    private int leftTop;
//    private int rightTop;
//    private int length;
//
//    public Stack(int size) {
//        this.arr = new int[size];
//        this.size = size;
//        this.leftTop = -1;
//        this.rightTop = size;
//        this.length = 0;
//    }
//
//    public void pushLeft(int data) {
//        if (leftTop + 1 == rightTop) {
//            System.out.println("Stack is Full");
//            return;
//        }
//        arr[++leftTop] = data;
//        length++;
//    }
//
//    public void pushRight(int data) {
//        if (leftTop + 1 == rightTop) {
//            System.out.println("Stack is Full");
//            return;
//        }
//        arr[--rightTop] = data;
//        length ++;
//    }
//    public int popLeft() {
//        if (leftTop == -1) {
//            System.out.println("Stack is Empty");
//            return -1;
//        }
//        length--;
//        return arr[leftTop--];
//    }
//    public int popRight() {
//        if (rightTop == size) {
//            System.out.println("Stack is Empty");
//            return -1;
//        }
//        length--;
//        return arr[rightTop++];
//    }
//
//    public int peekLeft() {
//        if (leftTop == -1) {
//            System.out.println("Stack is Empty");
//            return -1;
//        }
//        return leftTop;
//
//    }
//    public int peekRight() {
//        if (rightTop == size) {
//            System.out.println("Stack is Empty");
//            return -1;
//        }
//        return rightTop;
//    }
//    public void printStack() {
//        if (leftTop == -1 && rightTop == size) {
//            System.out.println("Stack is empty!");
//            return;
//        }
//        System.out.println("Left Stack:");
//        for (int i = leftTop; i >= 0; i--) {
//            System.out.print(arr[i] + " ");
//        }
//        System.out.println("Right Stack:");
//        for (int i = rightTop; i < size; i++) {
//            System.out.print(arr[i] + " ");
//        }
//        System.out.println("");
//    }
//
//    public static void main(String[] args) {
//        Stack s = new Stack(5);
//        s.pushRight(5);
//        s.pushRight(4);
//        s.pushRight(3);
//        s.pushRight(2);
//        s.pushRight(1);
//        s.printStack();
//        s.popRight();
//        s.printStack();
//    }
//}



















