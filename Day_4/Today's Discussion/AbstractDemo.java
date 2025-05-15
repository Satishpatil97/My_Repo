

abstract class Person
{
	// concreate behaviour which can be inherited by all the child classes or they may override
	void walk()
	{
		System.out.println("walk");
	}
	void talk()
	{
		System.out.println("talk");
	}
	void eat()
	{
		System.out.println("eat");
	}
	void sleep()
	{
		System.out.println("sleep");
	}
	//performDuties - contract given by parent class to child classes
	abstract void performDuties(); // contract
}
class Teacher extends Person
{
	void performDuties()
	{
		System.out.println("perform duties of Teacher");
	}
}
class HouseWife extends Person
{
	void performDuties()
	{
		System.out.println("perform duties of HouseWife");
	}
}
class Soldier extends Person
{
	void performDuties()
	{
		System.out.println("perform duties of Soldier");
	}
}
public class AbstractDemo
{
	static void perform(Person ref)
	{
		ref.walk();
		ref.talk();
		ref.eat();
		ref.sleep();
		ref.performDuties();
	}
	public static void main(String args[])
	{
		perform(new Teacher());
		perform(new Soldier());
		perform(new HouseWife());
	}
}	