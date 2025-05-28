import java.util.PriorityQueue;
import java.util.Collections;

public class HeapOperations {
    public static void main(String args[]) {
        // Min Heap
        PriorityQueue<Integer> MinHeap = new PriorityQueue<>();
        MinHeap.add(5);
        MinHeap.add(1);
        MinHeap.add(9);
        MinHeap.add(3);

        System.out.println("Min Heap: " + MinHeap);
        System.out.println("Peerk(min): " + MinHeap.peek());
        System.out.println("Extract(min): " + MinHeap.poll());
        System.out.println("min Heap after extract: " + MinHeap);

        // Max Heap
        PriorityQueue<Integer> MaxHeap = new PriorityQueue<>(Collections.reverseOrder());
        MaxHeap.add(5);
        MaxHeap.add(1);
        MaxHeap.add(9);
        MaxHeap.add(3);

        System.out.println("Min Heap: " + MaxHeap);
        System.out.println("Peerk(min): " + MaxHeap.peek());
        System.out.println("Extract(min): " + MaxHeap.poll());
        System.out.println("min Heap after extract: " + MaxHeap);
    }
}