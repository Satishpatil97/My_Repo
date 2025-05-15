

class Electronic_Appliance
{
	void on()
	{
	}
	void off()
	{
	}
}
class Tv extends Electronic_Appliance
{
	void on()
	{
		System.out.println("Tv on");
	}
	void off()
	{
		System.out.println("Tv off");
	}
}
class Washing_Machine extends Electronic_Appliance
{
	void on()
	{
		System.out.println("Washing_Machine on");
	}
	void off()
	{
		System.out.println("Washing_Machine off");
	}
	void fillWater()
	{
		System.out.println("fill required amount of water");
	}
}
public class Electronic_Appliance_Demo
{
	static void perform(Electronic_Appliance ref)
	{
		ref.on();
		// ref.fillWater(); not possible
		/*
		doesn't make sense
		Washing_Machine w=new Washing_Machine();
		w.fillWater();*/

		if(ref instanceof Washing_Machine)
		{
			Washing_Machine w=(Washing_Machine)ref;
			w.fillWater();
		}
		ref.off();

	}
	public static void main(String args[])
	{
		perform(new Tv());
		perform(new Washing_Machine());
	}
}