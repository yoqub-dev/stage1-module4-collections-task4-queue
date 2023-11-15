package com.epam.collections.queue;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class DishOrderDeterminer {
    public List<Integer> determineDishOrder(int numberOfDishes, int everyDishNumberToEat) {
        Queue<Integer> queue = new LinkedList<>();
        for (int i = 1; i <= numberOfDishes; i++) {
            queue.add(i);
        }

        List<Integer> result = new ArrayList<>();
        int count = 1;

        while (!queue.isEmpty()) {
            int dish = queue.poll();
            if (count == everyDishNumberToEat) {
                result.add(dish);
                count = 1;
            } else {
                queue.add(dish);
                count++;
            }
        }
        return result;
    }
}
