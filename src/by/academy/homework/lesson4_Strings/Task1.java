package by.academy.homework.lesson4_Strings;
import java.util.Scanner;

public class Task1 {
    public static void main(String...args)
    {
        int count = 0;

        System.out.println("Input the first text");
        Scanner skan1 = new Scanner(System.in);
        String txt1 = skan1.nextLine();

        System.out.println("Input the second text");
        Scanner skan2 = new Scanner(System.in);
        String txt2 = skan2.nextLine();

        char[] s1_array = txt1.toCharArray();
        char[] s2_array = txt2.toCharArray();

        if(s1_array.length == s2_array.length)
        {
             for (int i = 0; i < s1_array.length; i++)
             {
                 for (int j = 0; j < s2_array.length; j++)
                 {
                    if (s1_array[i] == s2_array[j])
                    {
                         count++;
                    }
                 }
             }
            if( count >= s1_array.length )
                System.out.println("First and second line characters match");
            else
                System.out.println("First and second line characters not match");
        }
        else
            System.out.println("First and second line characters not match");
    }
}
