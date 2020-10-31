package by.academy.homework.lesson2;
import java.io.IOException;
import java.util.Scanner;

public class Task2 {
    public static void main(String[]args) throws IOException {
        System.out.println("Введите тип данных");
        Scanner skan = new Scanner(System.in);
        String type = skan.nextLine();
        switch (type)
        {
            case "int":
                System.out.println("Введите переменную");
                Scanner skan1 = new Scanner(System.in);
                int i = skan1.nextInt();
                i%=2;
                System.out.println(i);
                break;
            case "float":
                System.out.println("Введите переменную");
                Scanner skan2 = new Scanner(System.in);
                float fl = skan2.nextFloat();
                fl*=fl;
                System.out.println(fl);
                break;
            case "double":
                System.out.println("Введите переменную");
                Scanner skan3 = new Scanner(System.in);
                double d = skan3.nextFloat();
                d*=0.3;
                System.out.println(d);
                break;
            case "char":
                System.out.println("Введите переменную");
                int x = System.in.read();
                char c = (char) x;
                System.out.println("Код символа: " + c + " = " + x);
                break;
            case "String":
                System.out.println("Введите переменную");
                Scanner skan5 = new Scanner(System.in);
                String s = skan5.nextLine();
                System.out.println("Hello" + s);
                break;
        }
    }
}
