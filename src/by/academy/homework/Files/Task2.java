package by.academy.homework.Files;

import java.io.*;

public class Task2 {

    public static void main(String[] args) throws IOException {

        File text_file = new File("/Users/cram/IdeaProjects/academy/src/by/academy/homework/Files/result.txt");
        char[] array = new char[1024];

        File nowtxt = new File("/Users/cram/IdeaProjects/academy/src/by/academy/homework/Files/task2.txt");
        int j = 0;

        StringBuilder str = new StringBuilder();
        try(FileReader filed = new FileReader(nowtxt)) {

            while ((j = filed.read(array))>0) {
                str.append(array);
            }
        }

        System.out.println(str);

        String[] words = str.toString().split(" ");

        try (FileWriter fwrite = new FileWriter(text_file)) {
           for (int i=0; i< words.length; i++) {
              fwrite.write(words[i]);
              System.out.println(words[i]);
           }
       }
    }
}
