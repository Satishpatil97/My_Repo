interface MouseEvent
{
	void mouseClicked();  // by default "public" and "abstract"
	void mouseEntered();
	void mouseExited();
}

interface WindowEvent
{
	void windowClosing();
	void windowOpening();
}
class GuiApp implements MouseEvent,WindowEvent
{
	public void mouseClicked()
	{
		System.out.println("mouse clicked logic");
	}	
	public void mouseEntered()
	{
		System.out.println("mouse entered logic");
	}
	public void mouseExited()
	{
		System.out.println("mouse exited logic");
	}
	public void windowClosing()
	{
		System.out.println("window closing logic");
	}
	public void windowOpening()
	{
		System.out.println("window opening logic");
	}
}
public class GuiAppDemo
{
	public static void main(String args[])
	{
		GuiApp g=new GuiApp();
		g.mouseClicked();
		g.mouseEntered();
		g.mouseExited();
		g.windowClosing();
		g.windowOpening();
	}
}