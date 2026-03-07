package heap;

import java.util.List;

/**
 * Powered by ChatGPT
 */
public class HeapPrinter {

    public static void printHeap(List<Integer> heap) {
        int n = heap.size();
        int levels = (int) Math.ceil(Math.log(n + 1) / Math.log(2));
        int index = 0;

        for (int level = 0; level < levels; level++) {
            int nodesInLevel = (int) Math.pow(2, level);

            int spacesBefore = (int) Math.pow(2, levels - level) - 1;
            int spacesBetween = (int) Math.pow(2, levels - level + 1) - 1;

            for (int i = 0; i < spacesBefore; i++) {
                System.out.print(" ");
            }
            for (int i = 0; i < nodesInLevel && index < n; i++) {
                System.out.print(heap.get(index));
                index++;
                for (int j = 0; j < spacesBetween; j++) {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }

        System.out.println("--------------------------------------");
    }
}
