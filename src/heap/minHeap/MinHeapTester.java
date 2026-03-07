package heap.minHeap;

import heap.HeapPrinter;

public class MinHeapTester {

    public static void main(String[] args) {
        var minHeap = new MinHeap();

        minHeap.insert(10);
        HeapPrinter.printHeap(minHeap.getMinHeap());
        minHeap.insert(5);
        HeapPrinter.printHeap(minHeap.getMinHeap());
        minHeap.insert(15);
        HeapPrinter.printHeap(minHeap.getMinHeap());
        minHeap.insert(20);
        HeapPrinter.printHeap(minHeap.getMinHeap());
        minHeap.insert(25);
        HeapPrinter.printHeap(minHeap.getMinHeap());
        minHeap.insert(13);
        HeapPrinter.printHeap(minHeap.getMinHeap());
        minHeap.insert(1);
        HeapPrinter.printHeap(minHeap.getMinHeap());

        int extractedInt = minHeap.extractMin();
        HeapPrinter.printHeap(minHeap.getMinHeap());

        System.out.println("Extracted Integer: " + extractedInt);
    }
}
