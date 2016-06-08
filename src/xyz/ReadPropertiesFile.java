package xyz;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Properties;

public class ReadPropertiesFile
{
	public static String getProperties(String KeyName)
	{
		String provalue = null;
		try {
			Properties pro=new Properties();
			FileReader file=new FileReader("src/xyz.properties");
			pro.load(file);
			provalue=pro.getProperty(KeyName);
			
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		return provalue;
		
	}
}
