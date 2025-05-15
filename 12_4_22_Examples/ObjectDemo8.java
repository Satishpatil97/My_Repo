/*
what is the difference between "equals()" method and == operator?
	ans:- Both "equals()" and == operator are same by default, i.e. they both check whether two references refer to same object or not. But the difference is "equals()" method can be overridden in order to check the content.
*/


class MyNum       // developer
{
	int num;
	MyNum(int num)
	{
		this.num=num;
	}
	public boolean equals(Object ref)  
	{
		return this.num==((MyNum)ref).num;
	}
}
public class ObjectDemo8
{
	public static void main(String args[])     // client
	{
		MyNum m1=new MyNum(100);
		Object m2=new MyNum(100);
		if(m1.equals(m2))  
		{
			System.out.println("m1 and m2 are equals");
		}
		else
		{
			System.out.println("m1 and m2 are not equals");
		}
		
	}
}
	
