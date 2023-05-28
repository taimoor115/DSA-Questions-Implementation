package Queue.Questions;

import java.util.Stack;
//https://leetcode.com/problems/implement-queue-using-stacks/description/
public class QueueViaStack {
    private Stack<Integer> newestStack, oldestStack;

    //Constructor
    QueueViaStack() {
        newestStack = new Stack<>();
        oldestStack = new Stack<>();
    }
    //Size

    public int size() {
        return newestStack.size() + oldestStack.size();
    }

    //EnQueue
    public void enQueue(int value) {
        newestStack.push(value);
    }

    //Helper Function
    private void shiftDataInReverseOrder() {
        if (oldestStack.isEmpty()) {
            while (!newestStack.isEmpty()) {
                int popData = newestStack.pop();
                oldestStack.push(popData);
            }
        }
    }
    //DeQueue

    public int deQueue() {
        shiftDataInReverseOrder();
        return oldestStack.pop();
    }

    //Peek
    public int peek() {
        shiftDataInReverseOrder();
        return oldestStack.pop();
    }

    public static void main(String[] args) {
        QueueViaStack q = new QueueViaStack();
        q.enQueue(5);
        q.enQueue(2);
        q.enQueue(3);
        q.enQueue(4);
        q.deQueue();
        System.out.println(q.size());
        System.out.println(q.deQueue());
        q.enQueue(1);
        System.out.println(q.peek());
    }
}
