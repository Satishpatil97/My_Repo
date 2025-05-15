class MyNum       // developer
{
	int num;
	MyNum(int num)
	{
		this.num=num;
	}
	public String toString()
	{
		return "["+num+"]";
	}
}
public class ObjectDemo2
{
	public static void main(String args[])     // client
	{
		MyNum m1=new MyNum(100);
		MyNum m2=new MyNum(100);
	
		System.out.println(m1);
		System.out.println(m2);  //  implicitly it calls "toString()"
	}
}