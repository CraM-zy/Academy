package by.academy.homework.lesson2;
import java.util.Scanner;

public class Task3 {
    public static void main(String[]args)
    {
        System.out.println ("Введите число от 1 до 10");
        Scanner skan1 = new Scanner(System.in);
        int num = skan1.nextInt();
        for(int i=1; i<=10; i++)
        {
            num= num*i;
            System.out.println(num);
            num=num/i;
        }
    }
}
