package by.academy.classwork.lesson2;

public class Task4 {
    public static void main(String[]args){
        int s = 5423000;
        int sec;
        int m;
        int min, h;
        sec = s % 60;
        m = (s - sec) / 60;
        min = m % 60;
        h = (m - min) / 60;
        int hour = h % 60;
        System.out.println( hour + " часов " + min + " минут " + sec + " секунд");

        int d = (h - hour)/24;
        int day = h % 60;
        System.out.println( day + "суток");

        int w = day/7;
        int week = day % 24;
        System.out.println( week + "недель");
    }
}
