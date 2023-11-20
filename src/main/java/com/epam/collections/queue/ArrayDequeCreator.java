package com.epam.collections.queue;

import java.util.*;

public class ArrayDequeCreator extends PriorityQueue<String> {
    public ArrayDeque<Integer> createArrayDeque(Queue<Integer> firstQueue, Queue<Integer> secondQueue) {
        ArrayDeque<Integer> arrayDeque = new ArrayDeque<>();

        while (!firstQueue.isEmpty() && !secondQueue.isEmpty()) {
            arrayDeque.add(firstQueue.poll());
            arrayDeque.add(Objects.requireNonNull(secondQueue.poll()));

            if (!firstQueue.isEmpty()) {
                firstQueue.add(firstQueue.poll());
            }

            if (!secondQueue.isEmpty()) {
                secondQueue.add(secondQueue.poll());
            }
        }

        while (!firstQueue.isEmpty()) {
            arrayDeque.add(firstQueue.poll());
        }

        while (!secondQueue.isEmpty()) {
            arrayDeque.add(secondQueue.poll());
        }

        return arrayDeque;
    }

}
