interface Storage
{
	void store();
	void load();
	void display();
}

class FileStorage implements Storage   // implementation of "Storage" interface
{
	public void store()
	{
		System.out.println("store inside filesystem");
	}
	public void load()
	{
		System.out.println("load from filesystem");
	}
	public void display()
	{	
		System.out.println("display from filesystem");
	}
}
class DatabaseStorage implements Storage    // implementation of "Storage" interface
{
	public void store()
	{
		System.out.println("store inside Database");
	}
	public void load()
	{
		System.out.println("load from Database");
	}
	public void display()
	{	
		System.out.println("display from Database");
	}
}
public class StorageDemo
{
	static void perform(Storage ref)
	{
		ref.store();   // polymorphic invocation
		ref.load();
		ref.display();
	}
	public static void main(String args[])
	{
		perform(new FileStorage());
		perform(new DatabaseStorage());
	}
}