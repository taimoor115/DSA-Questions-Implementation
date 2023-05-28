package Queue.Questions;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

//https://practice.geeksforgeeks.org/problems/queue-reversal/1
public class QueueReversal {

    public Queue<Integer> queueReversal(Queue<Integer> q) {
        Stack<Integer> stack = new Stack<>();
        while (!q.isEmpty()) {
            stack.push(q.poll());
        }
        while (!stack.isEmpty()) {
            q.offer(stack.pop());
        }
        return q;
    }
    public static void main(String[] args) {
        Queue<Integer> q = new LinkedList<>();
        q.offer(1);
        q.offer(2);
        q.offer(3);
        q.offer(4);
        q.offer(5);
        System.out.println("Original Queue:"+q);
        QueueReversal queue = new QueueReversal();
        Queue<Integer> revQueue = queue.queueReversal(q);
        System.out.println("Reversed Queue:"+ revQueue);

    }
}
