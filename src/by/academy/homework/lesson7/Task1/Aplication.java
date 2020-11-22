package by.academy.homework.lesson7.Task1;
import java.util.Scanner;

public class Aplication  implements Validator{

        public static void main(String[] args) {

            Scanner sc = new Scanner(System.in);
            System.out.println("Input first number: ");
            String str = sc.next();

            System.out.println("Input number: ");
            String d  = sc.next();
            sc.close();

            AmericanPhoneValidator apv = new AmericanPhoneValidator();
            System.out.println(apv.validate(str));

            BelarusPhoneValidator aaa = new BelarusPhoneValidator();
            System.out.println(aaa.validate(str));

            Aplication sss = new Aplication();
            System.out.println(sss.validate(d));
        }

        public boolean validate(String str)
        {
            String regex = "^[_A-Za-z0-9-\\+]+(\\.[_A-Za-z0-9-]+)*@" + "[A-Za-z0-9-]+(\\.[A-Za-z0-9]+)*(\\.[A-Za-z]{2,})$";
            return str.matches(regex);
        }

}
