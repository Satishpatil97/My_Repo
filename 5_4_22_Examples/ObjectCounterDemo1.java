// object counter program

public class ObjectCounterDemo1
{
	private int num;
	ObjectCounterDemo1()
	{
		System.out.println("in default constructor");
	}
	ObjectCounterDemo1(int num)
	{
		this.num=num;
		System.out.println("in parameterized constructor");
	}
	public static void main(String args[])
	{
		// how many ways you can instantiate the class?
		// two ways

		ObjectCounterDemo1 demo1=new ObjectCounterDemo1();
		ObjectCounterDemo1 demo2=new ObjectCounterDemo1(100);

		// how will you keep a track on no. of objects created in the program
	}
}