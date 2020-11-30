package by.academy.homework.internalClasses;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;
import java.util.concurrent.atomic.AtomicReference;


public class Task1_main {
    public static void main(String[] args) throws ParseException {

        Scanner scan = new Scanner(System.in);
        System.out.println("Input date in format ..-..-.. :");
        String str = scan.next();
        scan.close();
        System.out.println(str);

        SimpleDateFormat format = new SimpleDateFormat();
        format.applyPattern("dd-MM-yy");
        Task1_Date date = format.parse(str); // не работает. не знаю как исправить

        SimpleDateFormat simpleDateFormat = new SimpleDateFormat();
        simpleDateFormat.applyPattern("dd");
        String fDay = simpleDateFormat.format(date);
        int d = Integer.parseInt(fDay.trim());

        simpleDateFormat.applyPattern("MM");
        String fMounth = simpleDateFormat.format(date);
        int m = Integer.parseInt(fMounth.trim());

        simpleDateFormat.applyPattern("yy");
        String fYear = simpleDateFormat.format(date);
        int y = Integer.parseInt(fYear.trim());

        Task1_Date.Day day = date.new Day();
        Task1_Date.Year year = date.new Year();

        day.dayOfTheWeek(y, m, d);

    }
}
