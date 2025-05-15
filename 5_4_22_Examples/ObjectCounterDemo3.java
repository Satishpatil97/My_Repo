// object counter program

public class ObjectCounterDemo3
{
	private int num;
	private static int counter=0;

	{                          // non-static block
		counter++;
	}

	ObjectCounterDemo3()
	{
	}
	ObjectCounterDemo3(int num)
	{
		this.num=num;
	}
	public static int getCounter()
	{
		return counter;
	}
	public static void main(String args[])
	{
		// how many ways you can instantiate the class?
		// two ways

		ObjectCounterDemo3 demo1=new ObjectCounterDemo3();
		ObjectCounterDemo3 demo2=new ObjectCounterDemo3(100);

		// how will you keep a track on no. of objects created in the program
		System.out.println("Total no. of objects created\t"+ObjectCounterDemo3.getCounter());
	}
}