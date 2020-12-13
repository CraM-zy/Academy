package by.academy.homework.collections;

import by.academy.homework.internalClasses.Task3_iterator;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Task_4 {
    public static void main(String[] args) {
        List<Integer> collection = new ArrayList<>();

        collection.add(9);
        collection.add(1);
        collection.add(2);
        collection.add(7);
        collection.add(5);

        for(Integer out: collection) {
            System.out.println(out);
        }

        Iterator<Integer> iter = collection.iterator();

        Integer max = 0;
        while (iter.hasNext()) {
                Integer newMax = iter.next();
                if (newMax.compareTo(max) > 0)
                {
                    max = newMax;
                }
        }

        System.out.println("\n Maximum mark: " + max);
    }
}
