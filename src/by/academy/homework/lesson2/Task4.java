package by.academy.homework.lesson2;

public class Task4 {
    public static void main(String[]args)
    {
        int two=2;
        int i=1;
        int result = 0;
        while(result <= 1000000)
        {
                result = 2^i;
                i++;
        }
        System.out.println( result );
    }
}
