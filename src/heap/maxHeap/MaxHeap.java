package heap.maxHeap;

import java.util.ArrayList;
import java.util.List;

public class MaxHeap {

    private ArrayList<Integer> maxHeap;

    public MaxHeap() {
        this.maxHeap = new ArrayList<>();
    }

    public List<Integer> getMaxHeap() {
        return maxHeap.stream().toList();
    }

    public void insert(int newChild) {
        maxHeap.add(newChild);
        int childIndex = maxHeap.size() - 1;

        while (childIndex > 0 && maxHeap.get(childIndex) > getParentValue(childIndex)) {
            int parentIndex = getParentIndex(childIndex);
            swapIndexValues(childIndex, parentIndex);
            childIndex = parentIndex;
        }
    }

    public int extractMax() {
        if (maxHeap.isEmpty()) {
            throw new RuntimeException("Heap is empty!");
        }

        int maxValue = maxHeap.getFirst();
        int lastValue = maxHeap.getLast();

        maxHeap.set(0, lastValue);
        int currentIndex = 0;

        while (true) {
            int leftChildIndex = 2 * currentIndex + 1;
            int rightChildIndex = 2 * currentIndex + 2;
            int smallestIndex = currentIndex;

            if (leftChildIndex < maxHeap.size() && maxHeap.get(leftChildIndex) > maxHeap.get(smallestIndex)) {
                smallestIndex = leftChildIndex;
            }
            if (rightChildIndex < maxHeap.size() && maxHeap.get(rightChildIndex) > maxHeap.get(smallestIndex)) {
                smallestIndex = rightChildIndex;
            }
            if (smallestIndex == currentIndex) {
                break;
            }

            swapIndexValues(currentIndex, smallestIndex);
            currentIndex = smallestIndex;
        }

        return maxValue;
    }

    private int getParentValue(int x) {
        return maxHeap.get((x - 1) / 2);
    }

    private int getParentIndex(int x) {
        return (x - 1) / 2;
    }

    private void swapIndexValues(int childIndex, int parentIndex) {
        int childValue = maxHeap.get(childIndex);
        int parentValue = maxHeap.get(parentIndex);
        maxHeap.set(childIndex, parentValue);
        maxHeap.set(parentIndex, childValue);
    }

}
