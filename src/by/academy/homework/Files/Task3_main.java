package by.academy.homework.Files;

import java.io.*;
import java.util.ArrayList;

public class Task3_main {
    public static void main(String[] args) throws IOException {

        ArrayList<Task3_user> list= new ArrayList<Task3_user>();

        list.add(new Task3_user("Vanya", "Petrov", 17));
        list.add(new Task3_user("Vasya", "Petrov", 18));
        list.add(new Task3_user("Kostya", "Petrov", 16));
        list.add(new Task3_user("Valera", "Petrov", 15));
        list.add(new Task3_user("Misha", "Petrov", 14));
        list.add(new Task3_user("Kolya", "Petrov", 13));
        list.add(new Task3_user("Sasha", "Petrov", 12));
        list.add(new Task3_user("Igor", "Petrov", 11));
        list.add(new Task3_user("Petya", "Petrov", 10));
        list.add(new Task3_user("Nikita", "Petrov", 19));

        File dir = new File("/Users/cram/IdeaProjects/academy/src/by/academy/homework/Files/users");
        if (!dir.exists()) {
            dir.mkdir();
        }
        for(Task3_user user: list) {
            File fileUser = new File(dir,  user.toString() + ".txt");
            if(!fileUser.exists())
            {
                fileUser.createNewFile();
            }
            try (FileOutputStream outputStream = new FileOutputStream(fileUser);
                 ObjectOutputStream objectOutputStream = new ObjectOutputStream(outputStream);) {

                objectOutputStream.writeObject(user);

            } catch (Exception e) {

                System.err.println(e.getMessage());
        }
        }
    }
}
