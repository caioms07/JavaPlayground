package heap.maxHeap;

import heap.HeapPrinter;

public class MaxHeapTester {

    public static void main(String[] args) {
        var maxHeap = new MaxHeap();

        maxHeap.insert(10);
        HeapPrinter.printHeap(maxHeap.getMaxHeap());
        maxHeap.insert(5);
        HeapPrinter.printHeap(maxHeap.getMaxHeap());
        maxHeap.insert(15);
        HeapPrinter.printHeap(maxHeap.getMaxHeap());
        maxHeap.insert(20);
        HeapPrinter.printHeap(maxHeap.getMaxHeap());
        maxHeap.insert(25);
        HeapPrinter.printHeap(maxHeap.getMaxHeap());
        maxHeap.insert(13);
        HeapPrinter.printHeap(maxHeap.getMaxHeap());
        maxHeap.insert(1);
        HeapPrinter.printHeap(maxHeap.getMaxHeap());

        int extractedInt = maxHeap.extractMax();
        HeapPrinter.printHeap(maxHeap.getMaxHeap());

        System.out.println("Extracted Integer: " + extractedInt);
    }
}
