package Queue.Questions;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

//https://practice.geeksforgeeks.org/problems/reverse-first-k-elements-of-queue/1
class ReverseFirstKElementsOfQueue {
    //Queue = {1,2,3,4,5} k = 3
    public Queue<Integer> reverse_K_Elements(Queue<Integer> q, int k) {
        if (q.isEmpty() || k <= 0 || k > q.size()) {
            return q;
        }
        Stack<Integer> stack = new Stack<>();
//         Push start to k elements into stack
//         stack = {1,2,3} top = 3
        for (int i = 0; i < k; i++) {
            stack.push(q.poll());
        }
        // Again enQueue elements into the queue
//        q = {4,5,3,2,1}
        while (!stack.isEmpty()) {
            q.offer(stack.pop());
        }
//      Maintain order q ={1,2,3,4,5}
        for (int i = 0; i < q.size() - k; i++) {
            q.offer(q.poll());
        }
        return q;
    }

    public static void main(String[] args) {
        Queue<Integer> queue = new LinkedList<>();
        queue.offer(1);
        queue.offer(2);
        queue.offer(3);
        queue.offer(4);
        queue.offer(5);
        System.out.println("Original Queue :" + queue);
        ReverseFirstKElementsOfQueue r = new ReverseFirstKElementsOfQueue();
        Queue<Integer> result = r.reverse_K_Elements(queue, 3);
        System.out.println("Reverse K Elements Queue:" + result);
    }
}
