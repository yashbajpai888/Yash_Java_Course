package This;

public class This39 {
	
	This39() //default const
	{
		System.out.println("Yash");
	}
	
	This39(int a) //parametrized const
	{
		this(); //this will called default constructor which is Yash
		System.out.println(a);
	}
	public static void main(String[] args) {
		This39 r=new This39(100);
		
	}
}
