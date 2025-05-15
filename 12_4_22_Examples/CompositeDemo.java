import java.util.Scanner;

class Room
{
	private String name;
	public Room(String name)
	{
		this.name=name;
	}
	public Room()
	{
		name=null;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
};

class House
{
	private String name;
	private String address;
	private int no_rooms;
	private Room rooms[];     // has-a 
	public	House(String name,String address,int no_rooms)
	{
		this.name=name;
		this.address=address;
		this.no_rooms=no_rooms;
		this.rooms=new Room[no_rooms];    // array of references to Room is created 
		String rname;
		Scanner sc=new Scanner(System.in);
		for(int i=0;i<no_rooms;i++)
		{
			System.out.println("enter room name");
			rname=sc.next();
			this.rooms[i]=new Room();    // object of "Room" is created
			this.rooms[i].setName(rname);
		}
	}
	
	void showRooms()
	{
		for(int i=0;i<no_rooms;i++)
		{
			System.out.println(rooms[i].getName());
		}
	}
	public String getName() {
		return name;
	}

	public String getAddress() {
		return address;
	}
}
public class CompositeDemo
{
	public static void main(String args[])
	{
		House house=new House("Samrat Mansion","Juhu,Mumbai",4);
		System.out.println(house.getName());
		System.out.println(house.getAddress());
		System.out.println("house has following rooms");
		house.showRooms();
		System.out.println("Lets renovate the house");
		house=null;
	}
}