public class StaticBlockDemo7
{
	static
	{
		System.out.println("in StaticBlockDemo7 first static block");
	}

	public static void main(String args[])
	{
		System.out.println("in main");
		A ob1=new A();
		A ob2=new A();
	}
}
class A
{
	static 
	{
		System.out.println("in A first static block");
	}
	static void disp1()
	{
		System.out.println("in static disp1");
	}
	void disp2()
	{
		System.out.println("in disp2");
	}
	A()
	{
		System.out.println("in A default constructor");
	}
}