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
		System.out.println("��� ����");
	}
	public void eat() 
	{
		System.out.println("��� ���");
	}
	public void walk() 
	{
		System.out.println("��� ������");
	}
	public Cat() {} //����������� �� ���������
	public Cat(String nickname, int age)
	{
		this.nickname=nickname;
	}
}

