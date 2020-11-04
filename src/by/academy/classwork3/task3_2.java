package by.academy.classwork3;

import java.util.Scanner;

public class task3_2 {

    public static void main(String[]args)
    {
        int summa = 0;
        System.out.println("Введите число N");
        Scanner skan = new Scanner(System.in);
        int num = skan.nextInt();
        for (int i = 1; i<num+1; i++)
        {
            summa += i;
        }
        System.out.println(summa);
    }
}
