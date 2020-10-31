package by.academy.homework.lesson2;
import java.util.Scanner;

public class Task1
{
        public static void main(String[]args)
        {
            System.out.println("Возраст покупателя");
            Scanner skan1 = new Scanner(System.in);
            int age = skan1.nextInt();
            System.out.println(age);
            System.out.println("Первоначальная сумма покупки");
            Scanner skan2 = new Scanner(System.in);
            double sum = skan2.nextInt();
            if (sum < 100) sum = sum * 0.95;
            if (sum >= 100 && sum <= 200) sum = sum * 0.93;
            if (sum > 200 && sum < 300) {
                if (age > 18) sum = sum * 0.84;
                else sum = sum * 0.91;
            }
            if (sum >= 300 && sum <= 400) sum = sum * 0.85;
            if (sum > 400) sum = sum * 0.8;
            System.out.println("Сумма покупки составила" + sum);
        }
}
