package by.academy.homework.Files;

import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class Task4 {
    public static void main(String[] args) throws IOException {
        File dir = new File("/Users/cram/IdeaProjects/academy/src/by/academy/homework/Files/100files");
        if (!dir.exists()) {
            dir.mkdir();
        }

        File nowtxt = new File("/Users/cram/IdeaProjects/academy/src/by/academy/homework/Files/task2.txt");

        if (!nowtxt.exists()) {
            return;
        }

        char[] array = new char[1024];
        int j = 0;
        StringBuilder str = new StringBuilder();
        try (FileReader fread = new FileReader(nowtxt)) {
            while ((j = fread.read(array)) > 0) {
                str.append(array);
            }
        }
        System.out.println(str);
        String word = str.toString();
        System.out.println(word.length());

        for (int i = 1; i <= 100; i++) {
            File file = new File(dir, "file" + i + ".txt");

            if (!file.exists()) {
                file.createNewFile();
            }

            try (FileWriter fwrite = new FileWriter(file)) {
                int random = (int) (Math.random() * 576);
                fwrite.write(word.substring(0, random));
            }
        }
        File fileResult = new File(dir, "result.txt");
        try (FileWriter filefolder = new FileWriter(fileResult)) {
            for (File files : dir.listFiles()) {
                System.out.println(files.getName());
                filefolder.write(files.getName());
            }
        }
    }
}
