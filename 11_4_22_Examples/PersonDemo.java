abstract class Person
{
	void walk()             //     concrete behaviour
	{
		System.out.println("walk");
	}
	void talk()              //     concrete behaviour
	{
		System.out.println("talk");
	}
	void eat()           //     concrete behaviour
	{
		System.out.println("eat");
	}
	abstract void performDuties();      //  contract
}
class Soldier extends Person
{
	void performDuties()
	{
		System.out.println("to protect the border");
	}

}
class Teacher extends Person
{
	void performDuties()
	{
		System.out.println("to teach students");
	}
}
class HouseWife extends Person
{
	void performDuties()
	{
		System.out.println("to take care of the family members");
	}
}

public class PersonDemo
{
	static void perform(Person ref)
	{
		ref.walk();
		ref.talk();
		ref.eat();
		ref.performDuties();
	}
	public static void main(String args[])
	{
		perform(new Soldier());
		perform(new Teacher());
		perform(new HouseWife());
	}
}