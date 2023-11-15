package com.epam.collections.queue;

import java.util.ArrayDeque;
import java.util.PriorityQueue;
import java.util.Queue;

public class ArrayDequeCreator extends PriorityQueue<String> {
    public ArrayDeque<Integer> createArrayDeque(Queue<Integer> firstQueue, Queue<Integer> secondQueue) {
        ArrayDeque<Integer> arrayDeque = new ArrayDeque<>();

        while (!firstQueue.isEmpty() && !secondQueue.isEmpty()) {
            arrayDeque.addLast(firstQueue.poll());
            arrayDeque.addLast(secondQueue.poll());
            arrayDeque.addLast(firstQueue.poll());
            arrayDeque.addLast(secondQueue.poll());
        }

        return arrayDeque;
    }
}
