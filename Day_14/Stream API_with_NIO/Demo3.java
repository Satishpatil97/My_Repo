

import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.stream.Stream;


public class Demo3
{
	public static void main(String args[])
	{
		try (Stream<Path> stream = Files.find(Paths.get("e:\\temp"),3, 
                (path, attr) -> String.valueOf(path).endsWith(".java"))) 
{
stream.forEach(System.out::println);
}

		catch(Exception ee)
		{
			ee.printStackTrace();
		}
	}
}
