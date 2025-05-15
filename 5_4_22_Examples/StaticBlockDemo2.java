public class StaticBlockDemo2
{
	static
	{
		System.out.println("in StaticBlockDemo2 first static block");
	}

	public static void main(String args[])
	{
		System.out.println("in main");
	}
	static
	{
		System.out.println("in StaticBlockDemo2 second static block");
	}
}