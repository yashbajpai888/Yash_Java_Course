package ZPrac;

public class prac extends Thread
{
	@Override
	public void run()
	{
		try
		{
			for(int i=1;i<=5;i++)
			{
				System.out.println("Yash");
			}
		}
		catch(Exception e)
		{
			System.out.println(e);
		}
	}
}
class Multith 
{
	public static void main(String[] args) throws Exception 
	{
		prac P=new prac();
		P.start();
		for(int i=1;i<5;i++)
		{
			System.out.println("diksha");
		}
	}
}
