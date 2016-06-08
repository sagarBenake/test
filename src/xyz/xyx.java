package xyz;

public class xyx
{
	static int count;
	xyx(int i)
	{
		System.out.println("Object"+i);
		count++;
	}
	static int getCount()
	{
		return count;
	}
	public static void main(String args[])
	{
		System.out.println(CONSTANCE.SERVER_NAME);
		System.out.println(CONSTANCE.SERVER_PORT);
		for(int i=1;i<=5;i++)
		{
			new xyx(i);
		}
		System.out.println(getCount());
	}
}
