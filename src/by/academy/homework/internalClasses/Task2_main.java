package by.academy.homework.internalClasses;

public class Task2_main
{
    public static void main(String[] args) {
        Task2_Array<Integer> s1 = new Task2_Array<>(20);

        System.out.println(s1.inputSize());
        System.out.println(s1);
       for (int i = 0; i< 10 ; i +=2)
       {
           s1.ADD(i);
       }
        System.out.println(s1);

        System.out.println(s1.getIndex(3));
        System.out.println(s1.lastInd());
        System.out.println(s1.getFirst());
        System.out.println(s1.getLast());

        s1.DeleteValue(8);
        System.out.println(s1);

        s1.DeleteInd(2);
        System.out.println(s1);
    }
}
