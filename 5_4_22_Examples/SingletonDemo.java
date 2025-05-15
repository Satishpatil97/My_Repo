class Singleton
{
	private static Singleton singleton=new Singleton();
	private Singleton()
	{
	}
// developer should distribute "singleton" with clients or users

	public static Singleton getSingleton()
	{
		return singleton;
	}

	public void disp1()
	{
		System.out.println("in disp1");
	}
	public void disp2()
	{
		System.out.println("in disp2");
	}

}

public class SingletonDemo
{
	public static void main(String args[])
	{
		// Singleton s1=new Singleton();  // it's not possible
		Singleton ref=Singleton.getSingleton();   // it's possible
		ref.disp1();
		ref.disp2();
	}
}