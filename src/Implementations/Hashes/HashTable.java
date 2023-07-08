package Implementations.Hashes;

public class HashTable {
    private HashNode[] buckets;
    private int numOfBuckets;// capacity of array
    private int size; //no of hashNodes

    HashTable() {
        this(10);
    }

    HashTable(int capacity) {
        this.numOfBuckets = capacity;
        this.buckets = new HashNode[numOfBuckets];
        this.size = 0;
    }

    private class HashNode {
        private Integer key;// generic type
        private String value;//generic type
        private HashNode next;//reference to the next hash node

        public HashNode(Integer key, String value) {
            this.key = key;
            this.value = value;
        }
    }

    public int size() {
        return size;
    }

    public boolean isEmpty() {
        return size == 0;
    }

    public void put(Integer key, String value) {

        if (key == null || value == null) {
            throw new IllegalArgumentException("Key is null");
        }
        int getIndex = getBucketIndex(key);  // 105 % 10 => 5
        HashNode head = buckets[getIndex];

        while (head != null) {
            if (head.key.equals(key)) {
                head.value = value;
                return;
            }
            head = head.next;
        }
        size++;
        head = buckets[getIndex]; // we use insert at start
        HashNode node = new HashNode(key, value);
        node.next = head;
        buckets[getIndex] = node;

    }

    public String get(Integer key) {
        int getIndex = getBucketIndex(key);
        HashNode head = buckets[getIndex];
        while (head != null) {  //help in encountering the node
            if (head.key.equals(key)) {
                return head.value;
            }
            head = head.next;
        }
        return null;    //if doesn't exit
    }

    public String remove(int key) {
        int getIndex = getBucketIndex(key);
        HashNode head = buckets[getIndex];
        HashNode previous = null;

        while (head != null) {

            if (head.key.equals(key)) { //help in encountering the exact node
                break;
            }
            previous = head;  // start -> 1 -> 2 -> null help in 1
            head = head.next;
        }
        if (head == null) {  //if no node is available then return simply null
            return null;
        }
        size--; // size should be decreased each time

        if (previous != null) {
            previous.next = head.next;  // help removing 1 in above example
        } else {
            buckets[getIndex] = head.next;  //start 1 -> 2 -> null help in removing 2
            // start 1 -> null and 1 in this case

        }
        return head.value;
    }

    public int getBucketIndex(Integer key) {
        return key % numOfBuckets;
    }

    public static void main(String[] args) {
        HashTable h = new HashTable();
        h.put(105, "Taimoor");
        h.put(21, "Ali");
        h.put(31, "Usman");
        System.out.println(h.size());
        System.out.println(h.get(31));
        System.out.println(h.remove(105));
        System.out.println(h.size());

    }
}
