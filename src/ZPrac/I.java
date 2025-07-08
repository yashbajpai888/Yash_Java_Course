package ZPrac;

public interface I {
	default void speed()
	{
		System.out.println("Speed = 100");
	}
}
class O implements I
{
	public static void main(String[] args)
	{
		O o=new O();
		o.speed();
	}	
}
