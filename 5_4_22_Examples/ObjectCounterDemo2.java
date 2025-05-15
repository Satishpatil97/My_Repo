// object counter program

public class ObjectCounterDemo2
{
	private int num;
	private static int counter=0;
	ObjectCounterDemo2()
	{
		counter++;
	}
	ObjectCounterDemo2(int num)
	{
		this.num=num;
		counter++;
	}
	public static int getCounter()
	{
		return counter;
	}
	public static void main(String args[])
	{
		// how many ways you can instantiate the class?
		// two ways

		ObjectCounterDemo2 demo1=new ObjectCounterDemo2();
		ObjectCounterDemo2 demo2=new ObjectCounterDemo2(100);

		// how will you keep a track on no. of objects created in the program
		System.out.println("Total no. of objects created\t"+ObjectCounterDemo2.getCounter());
	}
}