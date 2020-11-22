package by.academy.homework.lesson7.Task1;
import java.text.Format;
import java.time.LocalDate;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.text.ParseException;
import java.text.DateFormat;
import java.util.Scanner;
import java.util.TimeZone;
import java.util.Date;
import by.academy.homework.lesson7.Task1.Date;

public class Date
{
    public static void main(String...args) throws ParseException
    {
        Scanner scan = new Scanner(System.in);
        System.out.println("Input date:");
        String str = scan.next();
        scan.close();

        Date dd = new Date();
        System.out.println(dd.Date1(str));
        System.out.println(dd.Date2(str));

        if (dd.Date1(str))
        {
            SimpleDateFormat format = new SimpleDateFormat();
            format.applyPattern("dd/MM/yyyy");
            Date date = format.parse(str);
            SimpleDateFormat simpleDateFormat = new SimpleDateFormat();
            simpleDateFormat.applyPattern("dd");
            System.out.println("Day : " + simpleDateFormat.format(date));
            simpleDateFormat.applyPattern("MMM");
            System.out.println("Month : " + simpleDateFormat.format(date));
            simpleDateFormat.applyPattern("yyyy");
            System.out.println("Year : " + simpleDateFormat.format(date));
        } else if(dd.Date2(str))
        {
            SimpleDateFormat format = new SimpleDateFormat();
            format.applyPattern("dd-MM-yyyy");
            Date date = format.parse(str);
            SimpleDateFormat simpleDateFormat = new SimpleDateFormat();
            simpleDateFormat.applyPattern("dd");
            System.out.println("Day : " + simpleDateFormat.format(date));
            simpleDateFormat.applyPattern("MMM");
            System.out.println("Month : " + simpleDateFormat.format(date));
            simpleDateFormat.applyPattern("yyyy");
            System.out.println("Year : " + simpleDateFormat.format(date));

        }
    }

    public boolean Date1(String s) {
        String regex = "^(0[1-9]|[12][0-9]|3[01])[/](0[1-9]|1[012])[0/]((19|20)\\d\\d)$";
        return s.matches(regex);
    }

    public boolean Date2(String s) {
        String regex = "^(0[1-9]|[12][0-9]|3[01])[-](0[1-9]|1[012])[-]((19|20)\\d\\d)$";
        return s.matches(regex);
    }
}
