package by.academy.homework.lesson7.Task1;

public interface Validator
{
    default boolean validate(String string)
    {
      return false;
   }
}
