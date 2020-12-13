package by.academy.homework.collections;

public class Task_6 {
    public static void main(String[] args) {
        int[] array = new int[8];

        try {
            for(int i=0; i<10; i++)
            {
                array[i] = 2;
                System.out.print(array[i]);
            }
        } catch (Exception e) {

            System.out.println((" ...Array is to small, expand the array"));
        }
    }
}
