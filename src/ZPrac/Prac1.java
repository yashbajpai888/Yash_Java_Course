package ZPrac;

public class Prac1 { 
	int a=12; static int b = 14;
	static{
		System.out.println(b);
	}
	{
		System.out.println(a);
		System.out.println(b);
	}
	
	public static void main(String[] args) {
		int b=20;
		Prac1 s=new Prac1();
		
	} 
}
