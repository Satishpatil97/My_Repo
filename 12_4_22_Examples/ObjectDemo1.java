class MyNum       // developer
{
	int num;
	MyNum(int num)
	{
		this.num=num;
	}
}
public class ObjectDemo1
{
	public static void main(String args[])     // client
	{
		MyNum m1=new MyNum(100);
		MyNum m2=new MyNum(100);
	
		System.out.println(m1.toString());
		System.out.println(m2);  //  implicitly it calls "toString()"
	}
}