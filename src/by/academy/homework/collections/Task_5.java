package by.academy.homework.collections;
import java.util.HashMap;

public class Task_5 {
    public static void main(String[] args) {
        String text = "Hello my dear friend";

        HashMap<Character, Integer> hash = new HashMap<Character, Integer>();

        for(int i=0; i<text.length(); i++)
        {
            if(hash.get(text.charAt(i)) == null)
            {
                hash.put(text.charAt(i), 1);
            }
            else {
                int key = hash.get(text.charAt(i));
                hash.put(text.charAt(i), ++key);
            }
        }

        System.out.println("Key:    " + hash.keySet());
        System.out.println("Values: " + hash.values());
        System.out.println(hash);
    }
}
