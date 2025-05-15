import java.util.Scanner;

public class AcceptInputDemo 
{
	public static void main(String[] args) 
	{
		String name;
		int age;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter name and age");
		name=sc.next();
		age=sc.nextInt();
		System.out.println(name+"\t"+age);
	}
}
