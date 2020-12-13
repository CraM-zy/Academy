package by.academy.homework.collections;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Collection;

public class Task_2
{
    public static void main(String[] args)
    {
        final int addElements = 1_000_000;
        final int chooseElements = 100_000;

        List<Integer> array = new ArrayList<>();
        List<Integer> linked = new LinkedList<>();

        for (int i = 0; i < addElements; i++) {

            array.add((int) (Math.random() * 9));
            linked.add((int) (Math.random() * 9));
        }

        System.out.println("ArrayList: " + howMuchTime(array, chooseElements) + " миллисекунд");
        System.out.println("LinkedList: " + howMuchTime(linked, chooseElements) + " миллисекунд");

    }

    public static long howMuchTime(List<Integer> arr, int n) {

        long start = System.currentTimeMillis();

        for (int i = 0; i < n; i++) {

            ((List<Integer>) arr).get((int) (Math.random() * 5));

        }

        long finish = System.currentTimeMillis();
        return finish - start;
    }
}
