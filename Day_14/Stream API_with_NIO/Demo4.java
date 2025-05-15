
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.stream.Stream;


public class Demo4
{
	public static void main(String args[])
	{
		
		try (Stream<String> stream = Files.lines(Paths.get("e:\\temp\\Example2.java"))) {
		    stream.map(String::toLowerCase).forEach(System.out::println);
		}
		catch(Exception ee)
		{
			ee.printStackTrace();
		}

		System.out.println("------------------------------------------");
System.out.println("Lets display the contents of file in upper case");

		    try(Stream<String> stream = Files.lines(Paths.get("e:\\temp\\Example2.java"))) 
	{
	stream.map(String::toUpperCase).forEach(System.out::println);
	}
	catch(Exception ee)
	{
		ee.printStackTrace();
	}
	}
}







