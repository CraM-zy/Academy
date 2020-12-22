package by.academy.homework.Files;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

import java.util.Scanner;
import java.util.StringTokenizer;

public class Task1 {
    public static void main(String[] args) throws IOException {
        Scanner src = new Scanner(System.in);
        System.out.println("Input text \n");
        String text = src.nextLine();

        File text_file = new File("homework\\Files\\task1.txt");

        if(!text_file.exists()) {
            text_file.createNewFile();
        }
        try (FileWriter fwrite = new FileWriter(text_file))
        {
            StringTokenizer st = new StringTokenizer(text);
            while (!text.equals("stop")) {
                fwrite.append(text + " ");
                System.out.println("Input text \n");
                text = src.nextLine();
            }
        }
        src.close();
    }
}
