package Abstraction;

interface vehicall
{
	String Name="TVS";
	int Speed=100;
	void start();
	void stop();
}

public class Interface implements vehicall
{
	@Override
	public void start()
	{
		System.out.println("start(): insert key & press start button");
	}
	@Override
	public void stop()
	{
		System.out.println("stop(): exit key");
	}
	public static void main(String[] args) {
		Interface i=new Interface();
		i.start(); i.stop();
	}
}
