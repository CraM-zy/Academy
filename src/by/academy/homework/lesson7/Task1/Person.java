package by.academy.homework.lesson7.Task1;
import java.util.Scanner;

public class Person
{
    String name;
    double cash;
    String birth;
    public static final Validator BelarusPhoneValidator = new BelarusPhoneValidator();
    public static final Validator EmailValidator = new EmailValidator();

    public Person(String name, double cash)
    {
        super();
        this.name=name;
        this.cash=cash;
    }
    public Person()
    {
        super();
    }

    public String getName()
    {
        return name;
    }

    public void setName(String name)
    {
        this.name=name;
    }

    public double getCash()
    {
        return cash;
    }

    public void setCash(double cash)
    {
        this.cash=cash;
    }

    Scanner s = new Scanner(System.in);
    public void dateBir()
    {
        System.out.println("Input your birthday date: ");
        birth = s.next();
        Date dateB = new Date();
        dateB.Date1(birth);

        while (!dateB.Date1(birth)) {
            System.out.println("Íå âåðíûé ôîðìàò äàòû.Ââåäèòå äàòó: ");
            birth = s.next();
        }
        System.out.println("Âàøà äàòà ðîæäåíèÿ: " + birth);
    }

    public void ValidPhone()
    {
        System.out.println("Input the phone number");
        String phone = s.next();
        while (!BelarusPhoneValidator.validate(phone))
        {
                System.out.println("This number is incorrect. Input new number: ");
                phone = s.next();
        }
    }

    public void ValidEmail()
    {
        System.out.println("Input your email: ");
        String email = s.next();
        while (!EmailValidator.validate(email))
        {
            System.out.println("Email is uncorrect. Input new email: ");
            email = s.next();
        }
    }
}
