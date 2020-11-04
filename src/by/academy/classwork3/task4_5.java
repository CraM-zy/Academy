package by.academy.classwork3;

public class task4_5 {
    static int num=1;
    public static void main(String...args)
    {
        do{
           if(num%5==0)
               System.out.println(num);
           num++;
        }while(num < 101);
    }
}
