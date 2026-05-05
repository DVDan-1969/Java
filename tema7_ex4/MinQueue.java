package tema7_ex4;

import java.util.PriorityQueue;

public class MinQueue {
    public static void main(String[] args) {

        PriorityQueue<Integer> queue = new PriorityQueue<>();

        // adăugăm elemente
        queue.add(5);
        queue.add(1);
        queue.add(3);
        queue.add(2);

        // scoatem elementele în ordine crescătoare
        while (!queue.isEmpty()) {
            System.out.println(queue.poll());
        }
    }
}
