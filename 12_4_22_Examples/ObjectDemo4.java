class MyNum       // developer
{
	int num;
	MyNum(int num)
	{
		this.num=num;
	}
}
public class ObjectDemo4
{
	public static void main(String args[])     // client
	{
		MyNum m1=new MyNum(100);
		MyNum m2=new MyNum(100);
		if(m1.equals(m2))
		{
			System.out.println("m1 and m2 are equals");
		}
		else
		{
			System.out.println("m1 and m2 are not equals");
		}

		if(m1==m2)
		{
			System.out.println("m1 and m2 are ==");
		}
		else
		{
			System.out.println("m1 and m2 are not ==");
		}

		MyNum m3=m1;

		if(m1.equals(m3))
		{
			System.out.println("m1 and m3 are equals");
		}
		else
		{
			System.out.println("m1 and m3 are not equals");
		}

		if(m1==m3)
		{
			System.out.println("m1 and m3 are ==");
		}
		else
		{
			System.out.println("m1 and m3 are not ==");
		}
	}
}
	
