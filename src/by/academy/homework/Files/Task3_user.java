package by.academy.homework.Files;

public class Task3_user {
    private String firstName;
    private String lastName;
    private int age;

    public Task3_user(String firstName, String lastName, int age){
        this.firstName = firstName;
        this.lastName = lastName;
        this.age = age;
    }

    @Override
    public String toString() {
        StringBuilder builder = new StringBuilder();

        builder.append(firstName + "_" + lastName);

        return builder.toString();
    }
}
