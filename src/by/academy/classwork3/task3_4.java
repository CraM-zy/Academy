package by.academy.classwork3;

import java.util.Scanner;

public class task3_4 {
    public static void main(String[]args)
    {
        int  kol_p=0, kol_o=0, kol_n=0 ;
        System.out.println("Введите kolichestvo N");
        Scanner skan = new Scanner(System.in);
        int size = skan.nextInt();
        for(int i=0; i<size; i++)
        {
            System.out.println("Введите число N");
            Scanner skan1 = new Scanner(System.in);
            int n = skan1.nextInt();
            if(n==0)
            {
                kol_n++;
            }
            if(n>0)
            {
                kol_p++;
            }
            if(n<0)
            {
                kol_o++;
            }
        }
        System.out.println("Количество нулей:" + kol_n);
        System.out.println("Количество положительных:" + kol_p);
        System.out.println("Количество отрицательных:" + kol_o);
    }
}
