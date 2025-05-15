class MyClass
{
	void disp(int k)   // overridden
	{
		System.out.println("disp int of MyClass\t"+k);
	}
	void disp(String s)
	{
		System.out.println("disp String of MyClass\t"+s);
	}
}
class A extends MyClass
{
	void disp(int k)   // overriding
	{
		super.disp(100);   // we are invoking overridden method
		disp("hello");
		System.out.println("disp int of A\t"+k);
	}
}
public class OverridingAndOverloadingDemo
{
	public static void main(String args[])
	{
		A obj=new A();
		obj.disp(50);
	}
}