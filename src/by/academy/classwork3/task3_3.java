package by.academy.classwork3;

import java.util.Scanner;

public class task3_3 {
    public static void main(String[]args)
    {
        int pr = 1;
        System.out.println("Введите число N");
        Scanner skan = new Scanner(System.in);
        int num = skan.nextInt();
        for (int i = 1; i<num+1; i++)
        {
            pr *= i;
        }
        System.out.println(pr);
    }
}
