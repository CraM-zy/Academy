package by.academy.classwork.lesson1;

public class Application 
{
	public static void main(String... args) 
	{
		Cat first = new Cat();
		first.nickname="Barsik";
		System.out.print("The name of the first cat: ");
		System.out.println(first.nickname);
		Cat second = new Cat();
		first.eat();
		first.sleep();
		first.walk();
		for(int i=0; i<3; i++)
		{
			second.grow(1);
		}
		Cat cat3 = new Cat("Cool", 4);
		System.out.print(cat3.nickname + " is " + cat3.age + " years old ");
	}
}