package by.academy.classwork.lesson2;

import java.util.Scanner;

public class Task3 {
    public static void main(String[]args)
    {
        System.out.println("Введите число");
        Scanner skan = new Scanner(System.in);
        int num = skan.nextInt();
        if(num % 2 == 0)
            System.out.println("Число четное");
        else
            System.out.println("Число нечетное");
    }
}
