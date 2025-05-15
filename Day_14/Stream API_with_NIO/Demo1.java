import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.stream.Stream;


public class Demo1
{
	public static void main(String args[])
	{
		try (Stream<Path> stream = Files.list(Paths.get("e:\\temp"))) 
		{
			System.out.println(stream);
		    stream.forEach(System.out::println);
		   
		}
		catch(Exception ee)
		{
			ee.printStackTrace();
		}
	}
}
