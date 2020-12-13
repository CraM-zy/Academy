package by.academy.homework.collections;

import by.academy.homework.internalClasses.Task3_iterator;

public class Task_3_main {
    public static void main(String[] args) {
        Integer[][] array = new Integer[][]{{1, 2, 3, 4, 5},{1,2,3,4},{6,7,8,9,10},{5,6,7,8}};

        Task_3<Integer> iterator = new Task_3<>(array);

        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }
    }
}
