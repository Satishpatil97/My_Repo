

import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.stream.Stream;


public class Demo2
{
	public static void main(String args[])
	{
		try (Stream<Path> stream = Files.list(Paths.get("e:\\temp"))) 
		{
		   stream.map(String::valueOf).filter(path -> path.endsWith(".java")).forEach(System.out::println);

		System.out.println("done");
		}
		catch(Exception ee)
		{
			ee.printStackTrace();
		}
	}
}
