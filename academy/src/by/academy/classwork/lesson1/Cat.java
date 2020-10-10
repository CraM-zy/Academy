package by.academy.classwork.lesson1;

public class Cat 
{
	int age;
	String nickname;
	public void grow(int addage) 
	{
		age=age+addage;
		System.out.println("Now the age of second cat is:" + age);
	}
	public void sleep() 
	{
		System.out.println("Кот спит");
	}
	public void eat() 
	{
		System.out.println("Кот ест");
	}
	public void walk() 
	{
		System.out.println("Кот гуляет");
	}
	public Cat() {} //конструктор по умолчанию
	public Cat(String nickname, int age)
	{
		this.nickname=nickname;
	}
}

