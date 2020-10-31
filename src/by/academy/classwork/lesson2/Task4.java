package by.academy.classwork.lesson2;

public class Task4 {
    public static void main(String[]args){
        int s = 370000;
        int sec;
        int m;
        int min, h;
        sec = s % 60;
        m = (s - sec) / 60;
        min = m % 60;
        h = (m - min) / 60;
        System.out.println(h + " часов " + min + " минут " + sec + " секунд");

        float day = h/24;
        System.out.println(h + "/" + "24" + "=" + day + "суток");

        float week = day/7;
        System.out.println(day + "/" + "7" + "=" + week + "недель");
    }
}
