package com.epam.collections.queue;

import java.util.ArrayDeque;
import java.util.Objects;
import java.util.PriorityQueue;
import java.util.Queue;

public class ArrayDequeCreator extends PriorityQueue<String> {
    public ArrayDeque<Integer> createArrayDeque(Queue<Integer> firstQueue, Queue<Integer> secondQueue) {
        ArrayDeque<Integer> arrayDeque = new ArrayDeque<>();

        while (!firstQueue.isEmpty() && !secondQueue.isEmpty()) {
            // Player 1 takes two cards from the ArrayDeque and adds them to their queue
            firstQueue.add(arrayDeque.poll());
            firstQueue.add(arrayDeque.poll());

            // Player 2 takes two cards from the ArrayDeque and adds them to their queue
            secondQueue.add(arrayDeque.poll());
            secondQueue.add(arrayDeque.poll());

            // Player 1 adds two cards from their queue to the ArrayDeque
            arrayDeque.addLast(firstQueue.poll());
            arrayDeque.addLast(firstQueue.poll());

            // Player 2 adds two cards from their queue to the ArrayDeque
            arrayDeque.addLast(secondQueue.poll());
            arrayDeque.addLast(secondQueue.poll());
        }

        return arrayDeque;


    }
}
