package by.academy.homework.lesson7.Task1;

public class AmericanPhoneValidator implements Validator
{
    public boolean validate(String string)
    {
        String regex = "^\\+1\\d{7}$";
        return string.matches(regex);
    }
}
