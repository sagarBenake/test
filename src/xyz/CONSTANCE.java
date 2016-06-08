package xyz;
import xyz.ReadPropertiesFile;
public class CONSTANCE
{
	public static String SERVER_NAME=ReadPropertiesFile.getProperties("server.name");
	public static int SERVER_PORT=Integer.parseInt(ReadPropertiesFile.getProperties("server.port"));
}
