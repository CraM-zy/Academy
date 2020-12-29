package by.academy.homework.Stream_lambda_reflection.Task_2;

public class User extends Person{

    public String login;
    public int password;
    public int email;


    public String getLogin() {
        return login;
    }

    public void setLogin(String login) {
        this.login = login;
    }

    public int getPassword() {
        return password;
    }

    public void setPassword(int password) {
        this.password = password;
    }

    public int getEmail() {
        return email;
    }

    public void setEmail(int email) {
        this.email = email;
    }

    public void printUserInfo(){}
}
