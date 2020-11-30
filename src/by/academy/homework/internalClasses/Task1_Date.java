package by.academy.homework.internalClasses;
import java.util.Scanner;
import java.util.Calendar;
import java.util.GregorianCalendar;

public class Task1_Date {

    class Year {
        String s;
        public void LeapYear( int year )
        {
            if ((year % 400 == 0) || ((year % 4 == 0) && (year % 100 != 0)))
            {
                System.out.println("This year is leap.");
            }
            else
                System.out.println("This year is not leap.");
        }
    }
    class Month{}
    class Day {
        public String dayOfTheWeek(int year, int month, int numDay) {
            String day = " ";
            GregorianCalendar calculate = new GregorianCalendar(year, month, numDay);
            int num = calculate.get(Calendar.DAY_OF_WEEK );
            switch (num)
            {
                case 1:
                    day = "Monday";
                    break;
                case 2:
                    day = "Tuesday";
                    break;
                case 3:
                    day = "Wednesday";
                    break;
                case 4:
                    day = "Thursday";
                    break;
                case 5:
                    day = "Friday";
                    break;
                case 6:
                    day = "Saturday";
                    break;
                case 7:
                    day = "Sunday";
                    break;
            }
            System.out.println(day);
            return day;
        }
    }
}
