package by.academy.classwork.lesson2;

import java.util.Scanner;

public class Task5 {
    public static void main(String[]args) {
        System.out.println("Введите число");
        Scanner skan1 = new Scanner(System.in);
        int num1 = skan1.nextInt();
        System.out.println("Введите число");
        Scanner skan2 = new Scanner(System.in);
        int num2 = skan2.nextInt();
        if(num1 > num2)
        {
            System.out.println( num1 + " наибольшее");
            System.out.println( num2 + " наименьшее");
        }
        else
        {
            System.out.println( num1 + " наименьшее");
            System.out.println( num2 + " наибольшее");
        }
        System.out.println( "Среднее арифметическое = " + (float)(num1+num2)/2);
    }
}
