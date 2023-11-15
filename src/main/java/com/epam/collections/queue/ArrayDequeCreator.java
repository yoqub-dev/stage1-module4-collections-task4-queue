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

        // Add remaining elements from both queues
        arrayDeque.addAll(firstQueue);
        arrayDeque.addAll(secondQueue);

        return arrayDeque;
    }
}
