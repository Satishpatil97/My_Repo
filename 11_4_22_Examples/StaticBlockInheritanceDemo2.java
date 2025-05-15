class base
{
	static
	{
		System.out.println("in base static");
	}
	base()
	{
		System.out.println("base const");
	}
}
class sub extends base
{
	static
	{
		System.out.println("in sub static");
	}
}
public class StaticBlockInheritanceDemo2
{
	static
	{
		System.out.println("in StaticBlockInheritanceDemo2 static block");
	}
	
	public static void main(String args[])
	{
		base b=new base();

		System.out.println("....................");
		sub s=new sub();
	}
}









