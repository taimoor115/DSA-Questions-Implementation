package Implementations.Heap;

public class MaxHeap {
    Integer[] heap;
    int size;

    public MaxHeap(int capacity) {
        this.heap = new Integer[capacity + 1];
        this.size = 0;
    }

    public boolean isEmpty() {
        return size == 0;
    }

    public int size() {
        return size;
    }

    private void resize(int capacity) {
        Integer[] temp = new Integer[capacity];
        for (int i = 0; i < heap.length; i++) {
            temp[i] = heap[i];
        }
        heap = temp;
    }

    //    Insertion in Max Heap
    public void insert(int value) {
        if (size == heap.length - 1) {
            resize(2 * heap.length);
        }
        size++;
        heap[size] = value;
        swim(size);
    }

    private void swim(int k) {
        while (k > 1 && heap[k / 2] < heap[k]) {
            int temp = heap[k];
            heap[k] = heap[k / 2];
            heap[k / 2] = temp;
            k = k / 2;
        }
    }

    public void printMaxHeap() {
        for (int i = 1; i <= size; i++) {
            System.out.print(heap[i] + " ");
        }
    }

    public static void main(String[] args) {
        MaxHeap mh = new MaxHeap(4);
        mh.insert(1);
        mh.insert(34);
        mh.insert(32);
        mh.insert(3);
        mh.insert(12);
        mh.insert(43);
        mh.insert(12);
        System.out.println(mh.size);
        mh.printMaxHeap();
    }
}
