package by.academy.homework.lesson7.Task1;

public class BelarusPhoneValidator implements Validator
{
    public boolean validate(String string)
    {
        String regex = "^\\+375\\d{9}$";
        return string.matches(regex);
    }
}
