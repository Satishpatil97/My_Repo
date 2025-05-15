class base
{
	static
	{
		System.out.println("in base static");
	}
}
class sub extends base
{
	static
	{
		System.out.println("in sub static");
	}
}
public class StaticBlockInheritanceDemo1 extends sub
{
	static
	{
		System.out.println("in StaticBlockInheritanceDemo1 static");
	}
	public static void main(String args[])
	{
	}
}