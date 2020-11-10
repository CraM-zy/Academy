package by.academy.homework.lesson4_Strings;
import java.util.Scanner;

public class Task2
{
    public static void main(String...args)
    {
        int kol1 = 0, kol2 = 0;

        System.out.println("Input the text");
        Scanner skan1 = new Scanner(System.in);
        String text = skan1.nextLine();

        String[] word = text.split(" ");

        String word_first = word[0];
        char[] array = word_first.toCharArray();
        for (int i = 0; i < array.length; i++)
        {
            for (int j = i+1; j < array.length; j++)
            {
                if (array[i] == array[j])
                    kol1++;
            }
        }
        String temp = word_first;

        for (int k = 1; k < word.length; k++)
        {
            String word_now = word[k];
            char[] array_now = word_now.toCharArray();
            for (int i = 0; i < array_now.length; i++)
            {
                for (int j = i+1; j < array_now.length - 1; j++)
                {
                    if (array_now[i] == array_now[j])
                        kol2++;
                }
            }
            if (kol2 > kol1)
            {
                kol1 = kol2;
                temp = word[k];
            }
            else
            {
                kol2 = 0;
            }
        }
        if(kol1 == 0 && kol2 == 0)
            System.out.println(" Not repeated");
        else
            System.out.println(temp);
    }
}
