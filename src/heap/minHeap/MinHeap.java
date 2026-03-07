package heap.minHeap;

import java.util.ArrayList;
import java.util.List;

public class MinHeap {

    private final ArrayList<Integer> minHeap;

    public MinHeap() {
        this.minHeap = new ArrayList<>();
    }

    public List<Integer> getMinHeap() {
        return minHeap.stream().toList();
    }

    public void insert(int newChild) {
        minHeap.add(newChild);
        int childIndex = minHeap.size() - 1;

        while (childIndex > 0 && minHeap.get(childIndex) < getParentValue(childIndex)) {
            int parentIndex = getParentIndex(childIndex);
            swapIndexValues(childIndex, parentIndex);
            childIndex = parentIndex;
        }
    }

    public int extractMin() {
        if (minHeap.isEmpty()) {
            throw new RuntimeException("Heap is empty!");
        }

        int minValue = minHeap.getFirst();
        int lastValue = minHeap.getLast();

        minHeap.set(0, lastValue);
        int currentIndex = 0;

        while (true) {
            int leftChildIndex = 2 * currentIndex + 1;
            int rightChildIndex = 2 * currentIndex + 2;
            int smallestIndex = currentIndex;

            if (leftChildIndex < minHeap.size() && minHeap.get(leftChildIndex) < minHeap.get(smallestIndex)) {
                smallestIndex = leftChildIndex;
            }
            if (rightChildIndex < minHeap.size() && minHeap.get(rightChildIndex) < minHeap.get(smallestIndex)) {
                smallestIndex = rightChildIndex;
            }
            if (smallestIndex == currentIndex) {
                break;
            }

            swapIndexValues(currentIndex, smallestIndex);
            currentIndex = smallestIndex;
        }

        return minValue;
    }

    private int getParentValue(int x) {
        return minHeap.get((x - 1) / 2);
    }

    private int getParentIndex(int x) {
        return (x - 1) / 2;
    }

    private void swapIndexValues(int childIndex, int parentIndex) {
        int childValue = minHeap.get(childIndex);
        int parentValue = minHeap.get(parentIndex);
        minHeap.set(childIndex, parentValue);
        minHeap.set(parentIndex, childValue);
    }

}
