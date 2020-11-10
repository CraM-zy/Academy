package by.academy.homework.lesson4_Strings;

import java.util.Scanner;

public class Deal {
    public static void main(String...args)
    {
        System.out.println("Input the number of gamers");
        Scanner skan = new Scanner(System.in);
        int n = skan.nextInt();

        String[] suits = {"Пика", "Буба", "Чирва", "Крести"};

        String[] value = {"2", "3", "4", "5", "6", "7", "8", "9", "10",
                "Валет", "Дама", "Король", "Туз"};

        String[] cards= new String[52];

        for (int i = 0; i < value.length; i++)
        {
            for (int j = 0; j < suits.length; j++)
            {
                cards[suits.length*i + j] = value[i] + " " + suits[j];
            }
        }

        String temp = " ";
        for (int i = 0; i < n; i++)
        {
            int rand = i + (int) (Math.random() * (n-i));
            temp = cards[rand];
            cards[rand] = cards[i];
            cards[i] = temp;
        }

        for (int i = 0; i < n * 5; i++)
        {
            System.out.println(cards[i]);
            if(i%5 == 4)
                System.out.println( );
        }
    }
}
