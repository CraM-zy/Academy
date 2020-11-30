package by.academy.homework.internalClasses;

public class Task3_main {
    public static void main(String[] args)
    {
        Integer[] array = {1, 2, 3, 4, 5, 6, 7, 8, 9};
        Task3_iterator<Integer> iterator = new Task3_iterator<>(array);

        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }
    }
}
