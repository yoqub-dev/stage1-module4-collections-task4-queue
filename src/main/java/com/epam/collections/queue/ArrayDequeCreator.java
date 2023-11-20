package com.epam.collections.queue;

import java.util.ArrayDeque;
import java.util.Objects;
import java.util.PriorityQueue;
import java.util.Queue;

public class ArrayDequeCreator extends PriorityQueue<String> {
    public ArrayDeque<Integer> createArrayDeque(Queue<Integer> firstQueue, Queue<Integer> secondQueue) {
        ArrayDeque<Integer> arrayDeque = new ArrayDeque<>();

        while (!firstQueue.isEmpty() && !secondQueue.isEmpty()) {
            arrayDeque.addLast(firstQueue.poll()); // Player 1 adds a card
            arrayDeque.addLast(secondQueue.poll()); // Player 2 adds a card

            arrayDeque.addLast(firstQueue.poll()); // Player 1 adds another card
            arrayDeque.addLast(secondQueue.poll()); // Player 2 adds another card
        }

        return arrayDeque;


    }
}
