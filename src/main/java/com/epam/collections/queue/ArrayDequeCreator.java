package com.epam.collections.queue;

import java.util.ArrayDeque;
import java.util.Objects;
import java.util.PriorityQueue;
import java.util.Queue;

public class ArrayDequeCreator extends PriorityQueue<String> {
    public ArrayDeque<Integer> createArrayDeque(Queue<Integer> firstQueue, Queue<Integer> secondQueue) {
        ArrayDeque<Integer> arrayDeque = new ArrayDeque<>();

        while (!firstQueue.isEmpty() && !secondQueue.isEmpty()) {
            arrayDeque.addLast(firstQueue.poll());
            arrayDeque.addLast(Objects.requireNonNull(secondQueue.poll()));
        }

        // If any queue has remaining elements, add one from each queue in turn
        while (!firstQueue.isEmpty() || !secondQueue.isEmpty()) {
            if (!firstQueue.isEmpty()) {
                arrayDeque.addLast(firstQueue.poll());
            }
            if (!secondQueue.isEmpty()) {
                arrayDeque.addLast(secondQueue.poll());
            }
        }

        return arrayDeque;
    }
}
