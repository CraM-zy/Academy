package by.academy.homework.Stream_lambda_reflection.Task_2;

import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

public class Task2_main {
    public static void main(String[] args){
        Class<Person> person = Person.class;

        try {
            Person user = person.getConstructor().newInstance();
            Method method = person.getMethod("Name");
            method.setAccessible(true);
            method.invoke(user);
        }
        catch (IllegalAccessException | NoSuchMethodException | InvocationTargetException | InstantiationException e) {
            e.printStackTrace();
        }
        System.out.println(" ");

        Method[] methods = person.getMethods();
        System.out.println("\nMETHODS:");
        for (Method methodC : methods) {
            System.out.println(methodC.getName());
        }
        System.out.println(" ");

        Field[] fields = person.getFields();
        System.out.println("\nFIELDS:");
        for (Field fieldC:fields) {
            System.out.println(fieldC.getName());
        }
        System.out.println(" ");

        try { 
            Person user1 = person.getDeclaredConstructor().newInstance();
            Method declaredMethod = person.getDeclaredMethod("Name");
            declaredMethod.setAccessible(true);
            declaredMethod.invoke(user1);
        }
        catch (IllegalAccessException | NoSuchMethodException | InvocationTargetException | InstantiationException f) {
            f.printStackTrace();
        }
        System.out.println(" ");

        Method[] declaredMethods = person.getDeclaredMethods();
        System.out.println("\nDECLARED METHODS:");
        for (Method dmethods:declaredMethods) {
            System.out.println(dmethods.getName());
        }
        System.out.println(" ");

        Field[] declaredFields = person.getDeclaredFields();
        System.out.println("\nDECLARED FIELDS:");
        for (Field fieldss:declaredFields) {
            System.out.println(fieldss.getName());
        }
        System.out.println(" ");
    }
}
