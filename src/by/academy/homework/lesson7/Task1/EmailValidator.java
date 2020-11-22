package by.academy.homework.lesson7.Task1;

public class EmailValidator implements Validator
{
    public boolean validate(String string) {

        String regex = "^[_A-Za-z0-9-\\+]+(\\.[_A-Za-z0-9-]+)*@" +
                "[A-Za-z0-9-]+(\\.[A-Za-z0-9]+)*(\\.[A-Za-z]{2,})$";;
        return string.matches(regex);
    }
}
