package by.academy.homework.lesson4_Strings;

import java.util.Scanner;

public class Task3 {
    public static void main(String...args)
    {
        System.out.println("Input the first word");
        Scanner skan1 = new Scanner(System.in);
        String word1 = skan1.nextLine();

        System.out.println("Input the second word");
        Scanner skan2 = new Scanner(System.in);
        String word2 = skan2.nextLine();

        char[] array1 = word1.toCharArray();
        char[] array2 = word2.toCharArray();
        char[] result = new char[word1.length()/2 + word2.length()/2];
        char temp=' ';

        for(int i=0; i<word1.length()/2; i++)
        {
            temp = array1[i];
            result[i]=temp;
        }
        for( int j = (word2.length()/2); j<word2.length(); j++)
        {
            temp = array2[j];
            result[j]=temp;
        }
        System.out.println(result);
    }
}
