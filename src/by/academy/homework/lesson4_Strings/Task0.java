package by.academy.homework.lesson4_Strings;
import java.util.Scanner;

public class Task0
{

    static int pairs(int target, int[] array)
    {
        int count = 0;
        for (int j = 0; j < array.length; j++)
        {
            for(int i=j+1; i<array.length; i++)
            {
                if(array[i] - array[j] == target)
                    count++;
            }
        }
        return count;
    }

    public static void main(String...args) {
        System.out.println("Input the size of array");
        Scanner skan1 = new Scanner(System.in);
        int size = skan1.nextInt();

        int[] array = new int[size];

        System.out.println("Input the dicreace");
        Scanner skan2 = new Scanner(System.in);
        int target = skan2.nextInt();
        System.out.println(size +" " + target );

        for (int i = 0; i < size; i++)
        {
            array[i] = ((int) (Math.random() * 10));
            System.out.print(array[i] + " ");
        }
        
        System.out.println(" ");
        int result = pairs(target, array);
        System.out.println(result);
    }
}
