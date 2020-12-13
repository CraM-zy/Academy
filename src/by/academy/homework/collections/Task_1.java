package by.academy.homework.collections;

import java.util.HashSet;
import java.util.Set;

public class Task_1 {
    public static void main(String[] args)
    {
        Set<String> collection= new HashSet<>();
        collection.add("1");
        collection.add("2");
        collection.add("3");
        collection.add("4");
        collection.add("3");
        collection.add("4");

        for(String out: collection)
        {
            System.out.println(out + "\t");
        }
    }
}
